package ma.emi.est.mde.xmi.abstraction;

import org.eclipse.mde.engineering.Util;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435430753879_996729_3592_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class ControlFlow extends Edge {
	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private Node guard = null;

	/**
	 * Get {@link ControlFlow}'s {@link #guard}
	 * @return {@link ControlFlow}'s {@link #guard}
	 * @see #guard
	 * @generated
	 */
	 
	public ControlFlow() {
		super();
		setType("uml:ControlFlow");
		setId(Util.generateId());
		setName("");
	}
	
	public Node getGuard() {
		return guard;
	}

	public void setGuard(Node setValue) {
		guard = setValue;
	}

	/**
	 * Returns the string representation of this ControlFlow.
	 *
	 * @generated
	 */
	
	@Override
	public String xmiFormat() {
			
		if (guard != null) {
			StringBuffer content = new StringBuffer();
			content.append("\t\t<edge xmi:type='" + getType() + "' "
					+ "xmi:id='" + getId() + "' name='" + getName() + "' "
					+ "source='" + getSource() + "' target='" + getTarget() + "'>\n");
			
			OpaqueExpression exp = (OpaqueExpression) guard;
			
			content.append("\t\t\t<guard xmi:type='" + exp.getType() + "' xmi:id='" + exp.getId() + "'>\n");
			content.append("\t\t\t\t<language>" + exp.getLanguage() +"</language>\n");
			content.append("\t\t\t\t<body>" + exp.getBody().replace("<", "&lt;") +"</body>\n");
			content.append("\t\t\t</guard>\n");
			content.append("\t\t</edge>\n");
			
			return content.toString();
		
		} else {
			
			return super.xmiFormat();
		}

		
	}

	@Override
	public void accept(XMIVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
