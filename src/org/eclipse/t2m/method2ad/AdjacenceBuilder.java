package org.eclipse.mde.engineering;

import ma.emi.est.mde.xmi.abstraction.Activity;
import ma.emi.est.mde.xmi.abstraction.DecisionNode;
import ma.emi.est.mde.xmi.abstraction.Node;

public class AdjacenceBuilder {

	private Activity a;
	//	private int index;
	private int level = 0;
	private int chain = 0;
	private int[][] m;
	
	public AdjacenceBuilder(Activity a) {
		super();
		this.a = a;
		int order = a.getNodes().size();
		this.m = new int[order][order];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = 0;
			}
		}
	}

	public AdjacenceBuilder(int[][] m, int level, int chain) {
		this.m = m;
		this.level = level;
		this.chain = chain;
	}

	public int[][] getMatrix() {
		return m;
	}
	public void build() {
		int index;
		for (int i = 0; i < m.length - 1; i++) {
			Node current = a.getNodes().get(i);
			Node next = a.getNodes().get(i + 1);
			if (current instanceof DecisionNode) {
				m[i][i + 1] = 1;
				index = i + 1;
				boolean b = true;
				while (b) {
					if (!current.getId().equals(a.getNodes().get(index).getRoot())
							|| current.getChain() == a.getNodes().get(index).getChain())
						index ++;
					else {
						b = false;
						m[i][index] = 1;
					}
				}
				
			} else {
				if (current.getLevel() == next.getLevel()) {
					if (current.getChain() == next.getChain()) {
						m[i][i + 1] = 1;
					} else {
						index = i + 1;
						boolean b = true;
						while (b) {
							if (current.getChain() != a.getNodes().get(index).getChain()
									|| current.getLevel() == a.getNodes().get(index).getLevel())
								index ++;
							else {
								b = false;
								m[i][index] = 1;
							}
						}
						
					}

				} else {
					index = i + 1;
					boolean b = true;
					while (b) {
						if (current.getChain() == a.getNodes().get(index).getChain())
							index ++;
						else {
							b = false;
							m[i][index] = 1;
						}
					}
					
				}
			}
		}		
	}

	public void print() {
		System.out.println("********************");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("********************");
	}
}
