package ma.emi.est.mde.xmi.abstraction;

import org.eclipse.mde.engineering.Util;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435430602393_185879_3547_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class InitialNode extends Node {
	
	public InitialNode() {
		super();
		setType("uml:InitialNode");
		setId(Util.generateId());
		setName("");
	}

//	@Override
	public void accept(XMIVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
