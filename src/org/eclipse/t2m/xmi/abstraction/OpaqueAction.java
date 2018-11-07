package ma.emi.est.mde.xmi.abstraction;

import org.eclipse.mde.engineering.Util;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435430232374_728316_3523_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class OpaqueAction extends Node {
	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String body;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String language;
	
	public OpaqueAction() {
		super();
		setType("uml:OpaqueAction");
		setId(Util.generateId());
		setLanguage("JAVA");
	}

	/**
	 * Get {@link OpaqueAction}'s {@link #body}
	 * @return {@link OpaqueAction}'s {@link #body}
	 * @see #body
	 * @generated
	 */	 
	public String getBody() {
		return body;
	}

	/**
	 * Set {@link OpaqueAction}'s {@link #body}
	 * @param setValue The new {@link #body} value
	 * @see #body
	 * @generated
	 */
	public void setBody(String setValue) {
		body = setValue;
	}

	/**
	 * Get {@link OpaqueAction}'s {@link #language}
	 * @return {@link OpaqueAction}'s {@link #language}
	 * @see #language
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Set {@link OpaqueAction}'s {@link #language}
	 * @param setValue The new {@link #language} value
	 * @see #language
	 * @generated
	 */
	public void setLanguage(String setValue) {
		language = setValue;
	}

	/**
	 * Returns the string representation of this OpaqueAction.
	 *
	 * @generated
	 */
	
	@Override
	public String xmiFormat() {
//		Il faut gérer les outgoing et les incoming de telles sortes qu'ils soient écrits avec des espaces
//		dans le cas ou il y en aurait plusieurs.
		
		StringBuffer content = new StringBuffer();
		String outgoing = getOutgoing().toString().replace("[", "").replace("]", "").replace(",", " ");
		String incoming = getIncoming().toString().replace("[", "").replace("]", "").replace(",", " ");
		
		content.append("\t\t<node xmi:type='" + getType() + "'"
				+ " xmi:id='" + getId() + "' name='" + getName() + "' visibility='public'");
		
		if (!outgoing.equals("")) {
			content.append(" outgoing='" + outgoing + "'");
		}
		if (!incoming.equals("")) {
			content.append(" incoming='" + incoming + "'");
		}
		
		content.append(">\n");
		content.append("\t\t\t<language>" + language + "</language>\n");
		content.append("\t\t\t<body>" + body + "</body>\n");
		content.append("\t\t</node>\n");
		return content.toString();
	}

	@Override
	public void accept(XMIVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

//	@Override
//	public String toString() {
//		return "OpaqueAction [body=" + body + ", language=" + language + "]";
//	}
	
	
}
