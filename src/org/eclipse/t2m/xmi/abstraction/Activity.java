package ma.emi.est.mde.xmi.abstraction;

import java.util.LinkedList;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

/*PROTECTED REGION ID(_17_0_5_2670137_1435331108136_809898_3656_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class Activity extends BehavioralViewElement {
	
	private Model model;
	
	public Activity() {
		super();
		setType("uml:Activity");
		setNodes(new LinkedList<Node>());
		setEdges(new LinkedList<Edge>());
		
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public void accept(XMIVisitor v) {
		v.visit(this);
		v.endVisit(this);
	}

}
