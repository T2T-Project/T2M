package ma.emi.est.mde.xmi.abstraction;

import org.eclipse.mde.engineering.Util;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435430636006_153640_3571_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class ActivityFinalNode extends Node {
	
	public ActivityFinalNode() {
		super();
		setType("uml:ActivityFinalNode");
		setId(Util.generateId());
		setName("");
	}

	@Override
	public void accept(XMIVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
