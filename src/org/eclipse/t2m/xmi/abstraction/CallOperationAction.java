package ma.emi.est.mde.xmi.abstraction;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435431083091_591091_3631_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class CallOperationAction extends Node {
	
	public CallOperationAction() {
		super();
		setType("uml:CallOperationAction");
	}
	
	@Override
	public String xmiFormat() {
		// TODO Auto-generated method stub
		return super.xmiFormat();
	}

	@Override
	public void accept(XMIVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
