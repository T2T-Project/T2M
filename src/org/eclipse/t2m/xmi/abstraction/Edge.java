package ma.emi.est.mde.xmi.abstraction;
/*PROTECTED REGION ID(_17_0_5_2670137_1435330920483_132580_3593_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public abstract class Edge extends Element {
	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private Node target;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private Node source;

	/**
	 * Get {@link Edge}'s {@link #target}
	 * @return {@link Edge}'s {@link #target}
	 * @see #target
	 * @generated
	 */
	
	public Node getTarget() {
		return target;
	}

	/**
	 * Set {@link Edge}'s {@link #target}
	 * @param setValue The new {@link #target} value
	 * @see #target
	 * @generated
	 */
	public void setTarget(Node setValue) {
		target = setValue;
	}

	/**
	 * Get {@link Edge}'s {@link #source}
	 * @return {@link Edge}'s {@link #source}
	 * @see #source
	 * @generated
	 */
	public Node getSource() {
		return source;
	}

	/**
	 * Set {@link Edge}'s {@link #source}
	 * @param setValue The new {@link #source} value
	 * @see #source
	 * @generated
	 */
	public void setSource(Node setValue) {
		source = setValue;
	}


	/**
	 * Returns the string representation of this Edge.
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		return getId();
	}
	
	@Override
	public String xmiFormat() {
		
		StringBuffer content = new StringBuffer();
		content.append("\t\t<edge xmi:type='" + getType() + "'"
				+ " xmi:id='" + getId() + "' name='" + getName() + "'"
				+ " source='" + source + "' target='" + target + "'/>\n");

		return content.toString();
	}
}
