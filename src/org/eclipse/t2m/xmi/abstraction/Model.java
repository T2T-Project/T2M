package ma.emi.est.mde.xmi.abstraction;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

/*PROTECTED REGION ID(_17_0_5_2670137_1435329398024_463650_3401_import) ENABLED START*/
// manually-written import code here.
/*PROTECTED REGION END*/
/**
 * No comment on your model
 * 
 * @generated
 */
public class Model implements XmiSerializable {
	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String id;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String name;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String xmiVersion;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String xmiNamespace;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String umlNamespace;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private String filePath;

	/**
	 * No comment on your model
	 * 
	 * @generated
	 */
	private java.util.Collection<PackagedElement> packagedElements;
	
	public Model() {
		super();
		setPackagedElements(new HashSet<PackagedElement>());
	}

	public Model(String id, String name, String xmiVersion,
			String xmiNamespace, String umlNamespace) {
		this();
		this.id = id;
		this.name = name;
		this.xmiVersion = xmiVersion;
		this.xmiNamespace = xmiNamespace;
		this.umlNamespace = umlNamespace;
	}

	/**
	 * Get {@link Model}'s {@link #id}
	 * @return {@link Model}'s {@link #id}
	 * @see #id
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set {@link Model}'s {@link #id}
	 * @param setValue The new {@link #id} value
	 * @see #id
	 * @generated
	 */
	public void setId(String setValue) {
		id = setValue;
	}

	/**
	 * Get {@link Model}'s {@link #name}
	 * @return {@link Model}'s {@link #name}
	 * @see #name
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set {@link Model}'s {@link #name}
	 * @param setValue The new {@link #name} value
	 * @see #name
	 * @generated
	 */
	public void setName(String setValue) {
		name = setValue;
	}

	/**
	 * Get {@link Model}'s {@link #xmiVersion}
	 * @return {@link Model}'s {@link #xmiVersion}
	 * @see #xmiVersion
	 * @generated
	 */
	public String getXmiVersion() {
		return xmiVersion;
	}

	/**
	 * Set {@link Model}'s {@link #xmiVersion}
	 * @param setValue The new {@link #xmiVersion} value
	 * @see #xmiVersion
	 * @generated
	 */
	public void setXmiVersion(String setValue) {
		xmiVersion = setValue;
	}

	/**
	 * Get {@link Model}'s {@link #xmiNamespace}
	 * @return {@link Model}'s {@link #xmiNamespace}
	 * @see #xmiNamespace
	 * @generated
	 */
	public String getXmiNamespace() {
		return xmiNamespace;
	}

	/**
	 * Set {@link Model}'s {@link #xmiNamespace}
	 * @param setValue The new {@link #xmiNamespace} value
	 * @see #xmiNamespace
	 * @generated
	 */
	public void setXmiNamespace(String setValue) {
		xmiNamespace = setValue;
	}

	/**
	 * Get {@link Model}'s {@link #umlNamespace}
	 * @return {@link Model}'s {@link #umlNamespace}
	 * @see #umlNamespace
	 * @generated
	 */
	public String getUmlNamespace() {
		return umlNamespace;
	}

	/**
	 * Set {@link Model}'s {@link #umlNamespace}
	 * @param setValue The new {@link #umlNamespace} value
	 * @see #umlNamespace
	 * @generated
	 */
	public void setUmlNamespace(String setValue) {
		umlNamespace = setValue;
	}

	/**
	 * Get {@link Model}'s {@link #filePath}
	 * @return {@link Model}'s {@link #filePath}
	 * @see #filePath
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Set {@link Model}'s {@link #filePath}
	 * @param setValue The new {@link #filePath} value
	 * @see #filePath
	 * @generated
	 */
	public void setFilePath(String setValue) {
		filePath = setValue;
	}

	/**
	 * Get {@link Model}'s {@link #packagedElement}
	 * @return {@link Model}'s {@link #packagedElement}
	 * @see #packagedElement
	 * @generated
	 */
	public java.util.Collection<PackagedElement> getPackagedElements() {
		return packagedElements;
	}

	/**
	 * Set {@link Model}'s {@link #packagedElement}
	 * @param setValue The new {@link #packagedElement} value
	 * @see #packagedElement
	 * @generated
	 */
	public void setPackagedElements(java.util.Collection<PackagedElement> setValue) {
		packagedElements = setValue;
	}

	/**
	 * Returns the string representation of this Model.
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("(");
		buffer.append("id: ");
		buffer.append(id);
		buffer.append(", ");
		buffer.append("name: ");
		buffer.append(name);
		buffer.append(", ");
		buffer.append("xmiVersion: ");
		buffer.append(xmiVersion);
		buffer.append(", ");
		buffer.append("xmiNamespace: ");
		buffer.append(xmiNamespace);
		buffer.append(", ");
		buffer.append("umlNamespace: ");
		buffer.append(umlNamespace);
		buffer.append(", ");
		buffer.append("filePath: ");
		buffer.append(filePath);
		buffer.append(", ");
		buffer.append("packagedElement: ");
		buffer.append(packagedElements);
		buffer.append(")");
		return buffer.toString();
	}
	
	@Override
	public void toXMI() {
		try {
			PrintWriter p = new PrintWriter(filePath);
			p.println("<?xml version='1.0' encoding='UTF-8'?>");
			p.println("<uml:Model xmi:version='" + xmiVersion + "'" +
					" xmlns:xmi='" + xmiNamespace + "'" + 
					" xmlns:uml='" + umlNamespace + "'" +
					" xmi:id='" + id + "' name='" + name + "'>");
			
			for (Iterator<PackagedElement> iterator = packagedElements.iterator(); iterator.hasNext();) {
				PackagedElement element = iterator.next();
				
				p.println(element.xmiFormat());
				
			}
			
			p.print("</uml:Model>");
			p.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
