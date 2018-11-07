package org.eclipse.mde.engineering.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.mde.engineering.Performer;

public class Main {

	JFrame f = new JFrame();
	JProgressBar bar = new JProgressBar();
	JTextField jf = new JTextField(30);
	JTextField xf = new JTextField(30);
	JComboBox<String> xv = new JComboBox<>();
	JComboBox<String> un = new JComboBox<>();
	JComboBox<String> xn = new JComboBox<>();
	
	private void createAndShowGUI() {
		
		JPanel content = (JPanel) f.getContentPane();
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
//		p.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p1.setBorder(BorderFactory.createTitledBorder("Input"));
		
		JPanel p11 = new JPanel();
		p11.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l1 = new JLabel("Language:");
		l1.setPreferredSize(new Dimension(120, 25));
		p11.add(l1);
		JComboBox<String> jv = new JComboBox<>();
		jv.setPreferredSize(new Dimension(200, 25));
		jv.addItem("Java");
		jv.addItem("C++");
		jv.addItem("PHP");
		jv.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				jf.setText("");
			}
		});
		p11.add(jv);
		p1.add(p11);
		
		JPanel p12 = new JPanel();
		p12.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l2 = new JLabel("File location:");
		l2.setPreferredSize(new Dimension(120, 25));
		p12.add(l2);
//		location.setEnabled(false);
		p12.add(jf);
		JButton b = new JButton(new ImageIcon("lib/Open16.gif"));
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
//				jfc.setCurrentDirectory(new java.io.File("."));
				jfc.setFileFilter(new FileNameExtensionFilter("Java files", new String[]{"java"}));
				int i = jfc.showOpenDialog(f);
				if (i == JFileChooser.APPROVE_OPTION) {
					jf.setText(jfc.getSelectedFile().getPath());
				}
			}
		});
		p12.add(b);
		p1.add(p12);
		
		content.add(p1);
		
		JPanel p2 = new JPanel();
		p2.setBorder(BorderFactory.createTitledBorder("Output"));
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		JPanel p21 = new JPanel();
		p21.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l3 = new JLabel("XMI file location:");
		l3.setPreferredSize(new Dimension(120, 25));
		p21.add(l3);
//		location.setEnabled(false);
		p21.add(xf);
		JButton b2 = new JButton(new ImageIcon("lib/Open16.gif"));
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser xfc = new JFileChooser();
//				xfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int i = xfc.showOpenDialog(f);
				if (i == JFileChooser.APPROVE_OPTION) {
					xf.setText(xfc.getSelectedFile().getPath());
				}
			}
		});
		p21.add(b2);
		p2.add(p21);
		
		JPanel p22 = new JPanel();
		p22.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l4 = new JLabel("XMI version:");
		l4.setPreferredSize(new Dimension(120, 25));
		p22.add(l4);
		
		xv.setPreferredSize(new Dimension(200, 25));
		xv.addItem("2.1");
		p22.add(xv);
		p2.add(p22);
		
		JPanel p23 = new JPanel();
		p23.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l5 = new JLabel("XMI namespace:");
		l5.setPreferredSize(new Dimension(120, 25));
		p23.add(l5);
		
		xn.setPreferredSize(new Dimension(250, 25));
		xn.addItem("http://schema.omg.org/spec/XMI/2.1");
		p23.add(xn);
		p2.add(p23);
		
		JPanel p24 = new JPanel();
		p24.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel l6 = new JLabel("UML namespace:");
		l6.setPreferredSize(new Dimension(120, 25));
		p24.add(l6);
		
		un.setPreferredSize(new Dimension(250, 25));
		un.addItem("http://www.eclipse.org/uml2/2.0.0/UML");
		p24.add(un);
		p2.add(p24);
		
		content.add(p2);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final String path = jf.getText();
				final String xmiVersion = xv.getSelectedItem().toString();
				final String xmins = xn.getSelectedItem().toString();
				final String umlns = un.getSelectedItem().toString();
				final String target = xf.getText();
				Thread t = new Thread() {
					public void run() {
						try {
							new Performer(path, xmiVersion, xmins, umlns, target, bar, this);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				t.start();
				
				
			}
		});
		start.setPreferredSize(new Dimension(160, 25));
		JButton clear = new JButton("Clear");
		clear.setPreferredSize(new Dimension(100, 25));
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jf.setText("");
				xf.setText("");
				
			}
		});
		p3.add(clear);
		p3.add(start);
		
		content.add(p3);
		content.add(bar);
		bar.setVisible(false);
		f.setDefaultCloseOperation(3);
		
		f.pack();
		f.setVisible(true);		
		
	}
	
	public Main() {
		createAndShowGUI();
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}; 
                new Main();
            }

        });
	}
}
