/**
 * 
 */
package mil.navy.safecen.solr.support.model;

import java.io.Serializable;

/**
 * @author kerry.baumer
 *
 */
public class SolrDataAcftBean implements Serializable {

	/**
	 * Keep this in synch with parent
	 */
	private static final long serialVersionUID = SolrDataBean.serialVersionUID;
	
	private String acftModel;
	private String acftUnitCode;
	
	public SolrDataAcftBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param acftModel
	 * @param acftUnitCode
	 */
	public SolrDataAcftBean(String acftModel, String acftUnitCode) {
		super();
		this.acftModel = acftModel;
		this.acftUnitCode = acftUnitCode;
	}

	/**
	 * @return the acftModel
	 */
	public String getAcftModel() {
		return acftModel;
	}

	/**
	 * @param acftModel the acftModel to set
	 */
	public void setAcftModel(String acftModel) {
		this.acftModel = acftModel;
	}

	/**
	 * @return the acftUnitCode
	 */
	public String getAcftUnitCode() {
		return acftUnitCode;
	}

	/**
	 * @param acftUnitCode the acftUnitCode to set
	 */
	public void setAcftUnitCode(String acftUnitCode) {
		this.acftUnitCode = acftUnitCode;
	}
		
}
