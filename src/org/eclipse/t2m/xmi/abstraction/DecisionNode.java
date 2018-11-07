package ma.emi.est.mde.xmi.abstraction;

import org.eclipse.mde.engineering.Util;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435431401390_788543_3655_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */ 
public class DecisionNode extends Node {
	
	public DecisionNode() {
		super();
		setType("uml:DecisionNode");
		setId(Util.generateId());
	}

	@Override
	public void accept(XMIVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	
}
