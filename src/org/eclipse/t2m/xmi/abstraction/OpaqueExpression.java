package ma.emi.est.mde.xmi.abstraction;

import org.eclipse.mde.engineering.Util;

/*PROTECTED REGION ID(_17_0_5_2670137_1435715495797_157839_3515_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class OpaqueExpression extends OpaqueAction {
	
	public OpaqueExpression() {
		super();
		setType("uml:OpaqueExpression");
		setId(Util.generateId());
	}

	public OpaqueExpression(String string) {
		this();
		setBody(string);

	}
}
