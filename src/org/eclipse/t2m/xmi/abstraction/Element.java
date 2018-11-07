package ma.emi.est.mde.xmi.abstraction;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435329419136_961017_3422_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public abstract class Element {
	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String id;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String name = "";

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String type;

	/**
	 * No comment on your model
	 * 
	 * @return No comment on your model
	 */
	public abstract String xmiFormat();

	/**
	 * Get {@link Element}'s {@link #id}
	 * @return {@link Element}'s {@link #id}
	 * @see #id
	 * @generated
	 */
	
	public String getId() {
		return id;
	}

	/**
	 * Set {@link Element}'s {@link #id}
	 * @param setValue The new {@link #id} value
	 * @see #id
	 * @generated
	 */
	public void setId(String setValue) {
		id = setValue;
	}

	/**
	 * Get {@link Element}'s {@link #name}
	 * @return {@link Element}'s {@link #name}
	 * @see #name
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set {@link Element}'s {@link #name}
	 * @param setValue The new {@link #name} value
	 * @see #name
	 * @generated
	 */
	public void setName(String setValue) {
		name = setValue;
	}

	/**
	 * Get {@link Element}'s {@link #type}
	 * @return {@link Element}'s {@link #type}
	 * @see #type
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Set {@link Element}'s {@link #type}
	 * @param setValue The new {@link #type} value
	 * @see #type
	 * @generated
	 */
	public void setType(String setValue) {
		type = setValue;
	}

	/**
	 * Returns the string representation of this Element.
	 *
	 * @generated
	 */
	public abstract void accept(XMIVisitor v);
}
