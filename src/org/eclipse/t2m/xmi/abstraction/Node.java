package ma.emi.est.mde.xmi.abstraction;

import java.util.LinkedList;

/*PROTECTED REGION ID(_17_0_5_2670137_1435330719788_230557_3570_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public abstract class Node extends Element {
	
	private int level;
	private int chain;
	private String root = "";
	private OpaqueExpression condition;
	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private java.util.List<Edge> incoming = new LinkedList<Edge>();

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private java.util.List<Edge> outgoing = new LinkedList<Edge>();
	
	/**
	 * Get {@link Node}'s {@link #incoming}
	 * @return {@link Node}'s {@link #incoming}
	 * @see #incoming
	 * @generated
	 */
	public java.util.List<Edge> getIncoming() {
		return incoming;
	}

	/**
	 * Set {@link Node}'s {@link #incoming}
	 * @param setValue The new {@link #incoming} value
	 * @see #incoming
	 * @generated
	 */
	public void setIncoming(java.util.List<Edge> setValue) {
		incoming = setValue;
	}

	/**
	 * Get {@link Node}'s {@link #outgoing}
	 * @return {@link Node}'s {@link #outgoing}
	 * @see #outgoing
	 * @generated
	 */
	public java.util.List<Edge> getOutgoing() {
		return outgoing;
	}

	/**
	 * Set {@link Node}'s {@link #outgoing}
	 * @param setValue The new {@link #outgoing} value
	 * @see #outgoing
	 * @generated
	 */
	public void setOutgoing(java.util.List<Edge> setValue) {
		outgoing = setValue;
	}

	/**
	 * Returns the string representation of this Node.
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		
		return getId();
//			return "n[type: " + getType() + " root: " + root + ", text: " + getName() + 
//					", chain: " + chain + "]";
		
	}
	
	@Override
	public String xmiFormat() {
		
		StringBuffer content = new StringBuffer();
		String outgoing = getOutgoing().toString().
				replace("[", "").replace("]", "").replace(",", " ");
		String incoming = getIncoming().toString().
				replace("[", "").replace("]", "").replace(",", " ");
		
		content.append("\t\t<node xmi:type='" + getType() + "'"
				+ " xmi:id='" + getId() + "' name='" + getName() +
				"' visibility='public'");
		
		if (!outgoing.equals("")) {
			content.append(" outgoing='" + outgoing + "'");
		}
		if (!incoming.equals("")) {
			content.append(" incoming='" + incoming + "'");
		}
		
		content.append("/>\n");
		
		return content.toString();
	}

	public OpaqueExpression getCondition() {
		return condition;
	}

	public void setCondition(OpaqueExpression condition) {
		this.condition = condition;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getChain() {
		return chain;
	}

	public void setChain(int chain) {
		this.chain = chain;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

}

