package ma.emi.est.mde.xmi.abstraction;

import ma.emi.est.mde.xmi.visitors.XMIVisitor;

public class CreateObjectAction extends Node {
	
	private Object classifier;
	
	public CreateObjectAction() {
		super();
		setType("uml:CreateObjectAction");
	}

	@Override
	public void accept(XMIVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

//	public String xmiFormat() {
//		
////		StringBuffer content = new StringBuffer();
////		String outgoing = getOutgoing().toString().replace("[", "").replace("]", "").replace(",", " ");
////		String incoming = getIncoming().toString().replace("[", "").replace("]", "").replace(",", " ");
////		
////		content.append("\t\t<node xmi:type='" + getType() + "'"
////				+ " xmi:id='" + getId() + "' name='" + getName() + "' visibility='public'");
////		
////		if (!outgoing.equals("")) {
////			content.append(" outgoing='" + outgoing + "'");
////		}
////		if (!incoming.equals("")) {
////			content.append(" incoming='" + incoming + "'");
////		}
////		
////		content.append(" classifier=" + classifier);
////		content.append(">\n");
////		content.append("\t\t\t<language>" + language + "</language>\n");
////		content.append("\t\t\t<body>" + body + "</body>\n");
////		content.append("\t\t</node>\n");
//		return content.toString();
//	}
//	
	
}
