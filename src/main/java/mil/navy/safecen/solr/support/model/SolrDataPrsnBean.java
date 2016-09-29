/**
 * 
 */
package mil.navy.safecen.solr.support.model;

import java.io.Serializable;

/**
 * @author kerry.baumer
 *
 */
public class SolrDataPrsnBean implements Serializable {

	/**
	 * Keep this in synch with parent
	 */
	private static final long serialVersionUID = SolrDataBean.serialVersionUID;
	
	private Integer age;
	private String injClassn;
	private Integer injCost;
	private String persDepI;
	private String unitCode;
	private String invlvdPerSerl;

	/**
	 * 
	 */
	public SolrDataPrsnBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param invlvdPerSerl
	 */
	public SolrDataPrsnBean(String invlvdPerSerl) {
		super();
		this.invlvdPerSerl = invlvdPerSerl;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the injClassn
	 */
	public String getInjClassn() {
		return injClassn;
	}

	/**
	 * @param injClassn the injClassn to set
	 */
	public void setInjClassn(String injClassn) {
		this.injClassn = injClassn;
	}

	/**
	 * @return the injCost
	 */
	public Integer getInjCost() {
		return injCost;
	}

	/**
	 * @param injCost the injCost to set
	 */
	public void setInjCost(Integer injCost) {
		this.injCost = injCost;
	}

	/**
	 * @return the persDepI
	 */
	public String getPersDepI() {
		return persDepI;
	}

	/**
	 * @param persDepI the persDepI to set
	 */
	public void setPersDepI(String persDepI) {
		this.persDepI = persDepI;
	}

	/**
	 * @return the unitCode
	 */
	public String getUnitCode() {
		return unitCode;
	}

	/**
	 * @param unitCode the unitCode to set
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	/**
	 * @return the invlvdPerSerl
	 */
	public String getInvlvdPerSerl() {
		return invlvdPerSerl;
	}

	/**
	 * @param invlvdPerSerl the invlvdPerSerl to set
	 */
	public void setInvlvdPerSerl(String invlvdPerSerl) {
		this.invlvdPerSerl = invlvdPerSerl;
	}

}
