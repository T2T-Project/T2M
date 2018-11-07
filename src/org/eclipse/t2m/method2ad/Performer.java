package org.eclipse.mde.engineering;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.Block;

import ma.emi.est.mde.xmi.abstraction.Activity;
import ma.emi.est.mde.xmi.abstraction.ActivityFinalNode;
import ma.emi.est.mde.xmi.abstraction.InitialNode;
import ma.emi.est.mde.xmi.abstraction.Model;

public class Performer {
	
	public char[] load(String path) {
		try {
			InputStream fileCode = new FileInputStream(path);
			InputStreamReader code = new InputStreamReader(fileCode);
			BufferedReader reader = new BufferedReader(code);
			
			StringBuffer content = new StringBuffer("");		
			String line;
			
			while ((line = reader.readLine()) != null) {
				line = line.replaceAll("\t", "");

				content.append(line);
			}
					
			reader.close();
			code.close();
			fileCode.close();
			
			return content.toString().toCharArray();
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public Performer(String path, String xmiVersion, String xmins, String umlns, String target, JComponent comp, Thread t) throws InterruptedException {
		
		JProgressBar bar = (JProgressBar) comp;
		
		bar.setValue(0);
		bar.setMaximum(100);
		bar.setVisible(true);
		bar.validate();
		bar.repaint();
		
		char[] source = load(path);
		ASTParser parser = ASTParser.newParser(AST.JLS3);
		parser.setSource(source);
//		parser.setKind(ASTParser.K_COMPILATION_UIT);
		parser.setKind(ASTParser.K_STATEMENTS);

		Block block = (Block) parser.createAST(null);
//		CompilationUnit unit = (CompilationUnit) parser.createAST(null);
//		for (int i = 0; i < block.statements().size(); i++) {
//			System.out.println(block.statements().get(i));
//		}
		
		Model model = new Model(Util.generateId(), "reverse-engineering-project", xmiVersion,
				xmins, 
				umlns);
		
		Activity a = new Activity();
		a.setName("main");
		a.setId(Util.generateId());
		model.getPackagedElements().add(a);
		a.setModel(model);
		
		InitialNode i = new InitialNode();
		a.getNodes().add(i);
				
		JavaElementConverter converter = new JavaElementConverter(a, bar, t);
		block.accept(converter);
		
		
		ActivityFinalNode f = new ActivityFinalNode();
		a.getNodes().add(f);
		
		converter.print();
		
				
		AdjacenceBuilder builder = new AdjacenceBuilder(a);
		builder.build();
		bar.setValue(66);
		bar.repaint();
		builder.print();
		
		EdgeProcessor processor = new EdgeProcessor(builder.getMatrix(), a);
		processor.process();		
		bar.setValue(100);
		bar.validate();
		bar.repaint();
//		/////////////////////////
		
		model.setFilePath(target);
		model.toXMI();
	}

	public static void main(String[] args) {
		System.out.println(">> begin:"); // TODO Auto-generated method stub
//		new Performer(path, xmiVersion, xmins, umlns, target, comp, t);
		System.out.println(">> Operation successful.");
	}
	
}
