package org.eclipse.mde.engineering;

public class Matrix {

	private int[][] m;
	
	public Matrix(int size) {
		m = new int[size][size];
		
		for (int i = 0; i < size; i ++) {
			for (int j = 0; j < size; j ++) {
				m[i][j] = 0;
			}
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < m.length; i ++) {
			for (int j = 0; j < m.length; j ++) {
				sb.append(m[i][j] + " ");
			}
			sb.append('\n');
		}
		
		return sb.toString();
	}
	
	public void setValueAt(int v, int x, int y) {
		m[x][y] = v;
	}
	public int getValueAt(int x, int y) {
		return m[x][y];
	}
	
	public int[][] getMatrix() {
		return m;
	}
	

}
