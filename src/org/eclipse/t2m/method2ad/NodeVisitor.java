package org.eclipse.mde.engineering;

import javax.swing.JProgressBar;

import org.eclipse.jdt.core.dom.ASTVisitor;

import ma.emi.est.mde.xmi.abstraction.Activity;
import ma.emi.est.mde.xmi.abstraction.Node;
import ma.emi.est.mde.xmi.abstraction.OpaqueExpression;

public abstract class NodeVisitor extends ASTVisitor {
	
	protected Activity activity;
	protected int level = 0;
	protected int chain = 0;
	protected String root = "";
	protected JProgressBar bar;
	protected Thread t;
	protected OpaqueExpression condition = null;

	public NodeVisitor() {
		
	}
	
	public NodeVisitor(Activity activity, JProgressBar bar, Thread t) {
		this.activity = activity;
		this.bar = bar;
		this.t = t;
	}
	
	public NodeVisitor(Activity activity, String root, int level, int chain, OpaqueExpression condition) {
		this.activity = activity;
		this.root = root;
		this.level = level;
		this.chain = chain;
		this.condition = condition;
	}
	
	@SuppressWarnings("static-access")
	public void print() throws InterruptedException {
		System.out.println("********************");
		for (int i = 0; i < activity.getNodes().size(); i++) {
			Node n = activity.getNodes().get(i);
			bar.setValue(i);
			
			bar.validate();
			bar.repaint();
			t.sleep(50);
			for (int j = 0; j < n.getLevel(); j++) {
				System.out.print(" ");
			}
			System.out.println(i + 1 + " > " + n);
		}
		System.out.println("********************");
	}

}
