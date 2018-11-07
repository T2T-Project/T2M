package org.eclipse.mde.engineering;

import java.awt.List;

import javax.swing.JProgressBar;

import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.ThisExpression;

import ma.emi.est.mde.xmi.abstraction.Activity;
import ma.emi.est.mde.xmi.abstraction.ActivityFinalNode;
import ma.emi.est.mde.xmi.abstraction.DecisionNode;
import ma.emi.est.mde.xmi.abstraction.InitialNode;
import ma.emi.est.mde.xmi.abstraction.OpaqueAction;
import ma.emi.est.mde.xmi.abstraction.OpaqueExpression;

public class JavaElementConverter extends NodeVisitor {

	public JavaElementConverter(Activity activity, JProgressBar bar, Thread t) {
		super(activity, bar, t);
	}

	public JavaElementConverter(Activity activity, String root, int level, int chain, OpaqueExpression condition) {
		super(activity, root, level, chain, condition);
	}

	public boolean visit(IfStatement n) {
		DecisionNode d = new DecisionNode();
		d.setRoot(root);
		d.setLevel(level ++);
		d.setChain(chain);
		d.setCondition(condition);
		activity.getNodes().add(d);

		if (n.getThenStatement() != null) {
			OpaqueExpression c = new OpaqueExpression();
			c.setBody(n.getExpression().toString());
			n.getThenStatement().accept(new JavaElementConverter(activity, d.getId(), level, 0, c));
		}

		if (n.getElseStatement() != null) {
			OpaqueExpression c = new OpaqueExpression("else");
			n.getElseStatement().accept(new JavaElementConverter(activity, d.getId(), level, 1, c));
		}

		return false;
	}

	@Override
	public boolean visit(ThisExpression node) {
		// TODO Auto-generated method stub
		return true;
	}

	public void endVisit(IfStatement n) {
		level --;
		chain = 0;
	}

	public boolean visit(MethodInvocation n) {
		OpaqueAction o = new OpaqueAction();
		o.setRoot(root);
		o.setLevel(level);
		o.setChain(chain);
		o.setCondition(condition);
		condition = null;
		o.setName(n.arguments().get(0).toString().replace("\"", ""));
		o.setBody(n.toString());
		activity.getNodes().add(o);

		return false;
	}

	public boolean visit(MethodDeclaration n) {

		activity.setName(n.getName().getFullyQualifiedName());
		activity.getNodes().add(new InitialNode());
		
		return false;
	}

	public void endVisit(MethodDeclaration n) {
		
		activity.getNodes().add(new ActivityFinalNode());
	}

}
