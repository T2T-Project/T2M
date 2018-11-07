package ma.emi.est.mde.xmi.abstraction;

import java.util.Iterator;

/*PROTECTED REGION ID(_17_0_5_2670137_1435331041864_686345_3614_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public abstract class PackagedElement extends Element {
	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private java.util.List<Edge> edges;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private java.util.List<Node> nodes;

	/**
	 * Get {@link PackagedElement}'s {@link #edges}
	 * @return {@link PackagedElement}'s {@link #edges}
	 * @see #edges
	 * @generated
	 */
	public java.util.List<Edge> getEdges() {
		return edges;
	}

	/**
	 * Set {@link PackagedElement}'s {@link #edges}
	 * @param setValue The new {@link #edges} value
	 * @see #edges
	 * @generated
	 */
	public void setEdges(java.util.List<Edge> setValue) {
		edges = setValue;
	}

	/**
	 * Get {@link PackagedElement}'s {@link #nodes}
	 * @return {@link PackagedElement}'s {@link #nodes}
	 * @see #nodes
	 * @generated
	 */
	public java.util.List<Node> getNodes() {
		return nodes;
	}

	/**
	 * Set {@link PackagedElement}'s {@link #nodes}
	 * @param setValue The new {@link #nodes} value
	 * @see #nodes
	 * @generated
	 */
	public void setNodes(java.util.List<Node> setValue) {
		nodes = setValue;
	}

	/**
	 * Returns the string representation of this PackagedElement.
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer(super.toString());
		buffer.append(" (");
		buffer.append("edges: ");
		buffer.append(edges);
		buffer.append(", ");
		buffer.append("nodes: ");
		buffer.append(nodes);
		buffer.append(")");
		return buffer.toString();
	}
	
	@Override
	public String xmiFormat() {
		StringBuffer content = new StringBuffer();
		content.append("\t<packagedElement xmi:type='" + getType() + "'"
						+ " xmi:id='" + getId() + "' name='" + getName() + "'>\n");
		
		for (Iterator<Node> iterator = getNodes().iterator(); iterator.hasNext();) {
			Node node = iterator.next();
			content.append(node.xmiFormat());
		}
		
		for (Iterator<Edge> iterator = getEdges().iterator(); iterator.hasNext();) {
			Edge edge = iterator.next();
			content.append(edge.xmiFormat());
			
		}
		
		content.append("\t</packagedElement>\n");
		
		return content.toString();
	}

}
