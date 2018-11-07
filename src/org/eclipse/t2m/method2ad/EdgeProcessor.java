package org.eclipse.mde.engineering;

import org.eclipse.jdt.core.dom.ASTVisitor;

import ma.emi.est.mde.xmi.abstraction.Activity;
import ma.emi.est.mde.xmi.abstraction.ControlFlow;
import ma.emi.est.mde.xmi.abstraction.Node;

public class EdgeProcessor extends ASTVisitor {

	private int[][] m;
	private Activity a;

	public EdgeProcessor(int[][] m, Activity a) {
		super();
		this.m = m;
		this.a = a;
	}


	public void process() {
		//		System.out.println(">>> Begin edge processing.");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == 1) {
					Node source = a.getNodes().get(i);
					Node target = a.getNodes().get(j);

					ControlFlow edge = new ControlFlow();
					if(target.getCondition() != null) {
						edge.setGuard(target.getCondition());
					}
					edge.setSource(source);
					edge.setTarget(target);
					source.getOutgoing().add(edge);
					target.getIncoming().add(edge);
					a.getEdges().add(edge);
				}
			}
		}
	}
}
