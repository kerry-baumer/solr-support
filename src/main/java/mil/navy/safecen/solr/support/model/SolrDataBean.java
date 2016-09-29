/**
 * 
 */
package mil.navy.safecen.solr.support.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author kerry.baumer
 *
 */
public class SolrDataBean implements Serializable {

	/**
	 * Package scoped to synch child beans serialVersionUID
	 */
	static final long serialVersionUID = 1L;
	
	private String brnchSvc;			// type="string" indexed="true" stored="true" />
	private String city;				// type="string" indexed="true" stored="true" />
	private String conusI;				// type="string" indexed="true" stored="true" />
	private String country;				// type="string" indexed="true" stored="true" />
	private String county;				// type="string" indexed="true" stored="true" />
	private Double dodPropCost;			// type="float" indexed="true" stored="true"/>
	private String environment;			// type="textGeneral" indexed="true" stored="true" />
	private List<String> eventCharzn;	// type="ignored" multiValued="true" />
	private String eventClassn;			// type="string" indexed="false" stored="true" />
	private Double eventCost;			// type="float" indexed="true" stored="true"/>
	private String eventLocalTime;
	private String eventLocn;			// type="location" indexed="true" stored="true" />
	private String eventLocnLat;		// type="textGeneral" indexed="true" stored="true" />
	private String eventLocnLon;		// type="textGeneral" indexed="true" stored="true" />
	private String eventLocnTxt;		// type="string" indexed="true" stored="true" />
	private String htId;				// type="string" indexed="true" stored="true" required="true" multiValued="false" />
	private List<SolrDataAcftBean> involvedAcft;
	private List<SolrDataPrsnBean> involvedPeople;
	private List<String> loc;			// type="textGeneral" indexed="true" stored="true" multiValued="true"/>
	private Date mishDate;				// type="date" indexed="true" stored="true" multiValued="false"/>
	private List<String> mishT;			// type="string" indexed="true" stored="true" multiValued="true"/>
	private String narrative;			// type="textEnSplitting" indexed="true" stored="true" termVectors="true" termPositions="true" termOffsets="true"/>
	private Double nonDodPropCost;		// type="float" indexed="true" stored="true"/>
	private String notCountdRsnC;		// type="string" indexed="false" stored="true" />
	private String onBaseI;				// type="string" indexed="true" stored="true" />
	private String privNarr;			// type="string" indexed="true" stored="true" />
	private String reportCatgC;			// type="string" indexed="false" stored="true" />
	private String reportType;			// type="ignored" multiValued="true" />
	private String reportingUnit;		// type="string" indexed="true" stored="true" />
	private String rprtblEventSerl;		// type="string" indexed="false" stored="true" />
	private String rptCatg;				// type="string" indexed="true" stored="true"/>
	private String rptClass;			// type="textGeneral" indexed="true" stored="true" omitNorms="true"/>	<!-- report class --> 
	private String rptT;				// type="textGeneral" indexed="true" stored="true" omitNorms="true"/>	<!-- report type --> 
	private String shortNarr;			// type="textEnSplitting" indexed="true" stored="true" termVectors="true" termPositions="true" termOffsets="true"/>
	private Boolean showInSearchEdit;
	private Boolean showInSearchTool;
	private String state;				// type="string" indexed="true" stored="true" />
	
	public SolrDataBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the brnchSvc
	 */
	public String getBrnchSvc() {
		return brnchSvc;
	}

	/**
	 * @param brnchSvc the brnchSvc to set
	 */
	public void setBrnchSvc(String brnchSvc) {
		this.brnchSvc = brnchSvc;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the conusI
	 */
	public String getConusI() {
		return conusI;
	}

	/**
	 * @param conusI the conusI to set
	 */
	public void setConusI(String conusI) {
		this.conusI = conusI;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the dodPropCost
	 */
	public Double getDodPropCost() {
		return dodPropCost;
	}

	/**
	 * @param dodPropCost the dodPropCost to set
	 */
	public void setDodPropCost(Double dodPropCost) {
		this.dodPropCost = dodPropCost;
	}

	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	/**
	 * @return the eventCharzn
	 */
	public List<String> getEventCharzn() {
		return eventCharzn;
	}

	/**
	 * @param eventCharzn the eventCharzn to set
	 */
	public void setEventCharzn(List<String> eventCharzn) {
		this.eventCharzn = eventCharzn;
	}

	/**
	 * @return the eventClassn
	 */
	public String getEventClassn() {
		return eventClassn;
	}

	/**
	 * @param eventClassn the eventClassn to set
	 */
	public void setEventClassn(String eventClassn) {
		this.eventClassn = eventClassn;
	}

	/**
	 * @return the eventCost
	 */
	public Double getEventCost() {
		return eventCost;
	}

	/**
	 * @param eventCost the eventCost to set
	 */
	public void setEventCost(Double eventCost) {
		this.eventCost = eventCost;
	}

	/**
	 * @return the eventLocalTime
	 */
	public String getEventLocalTime() {
		return eventLocalTime;
	}

	/**
	 * @param eventLocn the eventLocalTime to set
	 */
	public void setEventLocalTime(String eventLocalTime) {
		this.eventLocalTime = eventLocalTime;
	}

	/**
	 * @return the eventLocn
	 */
	public String getEventLocn() {
		return eventLocn;
	}

	/**
	 * @param eventLocn the eventLocn to set
	 */
	public void setEventLocn(String eventLocn) {
		this.eventLocn = eventLocn;
	}

	/**
	 * @return the eventLocnLat
	 */
	public String getEventLocnLat() {
		return eventLocnLat;
	}

	/**
	 * @param eventLocnLat the eventLocnLat to set
	 */
	public void setEventLocnLat(String eventLocnLat) {
		this.eventLocnLat = eventLocnLat;
	}

	/**
	 * @return the eventLocnLon
	 */
	public String getEventLocnLon() {
		return eventLocnLon;
	}

	/**
	 * @param eventLocnLon the eventLocnLon to set
	 */
	public void setEventLocnLon(String eventLocnLon) {
		this.eventLocnLon = eventLocnLon;
	}

	/**
	 * @return the eventLocnTxt
	 */
	public String getEventLocnTxt() {
		return eventLocnTxt;
	}

	/**
	 * @param eventLocnTxt the eventLocnTxt to set
	 */
	public void setEventLocnTxt(String eventLocnTxt) {
		this.eventLocnTxt = eventLocnTxt;
	}

	/**
	 * @return the htId
	 */
	public String getHtId() {
		return htId;
	}

	/**
	 * @param htId the htId to set
	 */
	public void setHtId(String htId) {
		this.htId = htId;
	}

	/**
	 * @return the involvedAcft
	 */
	public List<SolrDataAcftBean> getInvolvedAcft() {
		return involvedAcft;
	}

	/**
	 * @param involvedAcft the involvedAcft to set
	 */
	public void setInvolvedAcft(List<SolrDataAcftBean> involvedAcft) {
		this.involvedAcft = involvedAcft;
	}

	/**
	 * @return the involvedPeople
	 */
	public List<SolrDataPrsnBean> getInvolvedPeople() {
		return involvedPeople;
	}

	/**
	 * @param involvedPeople the involvedPeople to set
	 */
	public void setInvolvedPeople(List<SolrDataPrsnBean> involvedPeople) {
		this.involvedPeople = involvedPeople;
	}

	/**
	 * @return the loc
	 */
	public List<String> getLoc() {
		return loc;
	}

	/**
	 * @param loc the loc to set
	 */
	public void setLoc(List<String> loc) {
		this.loc = loc;
	}

	/**
	 * @return the mishDate
	 */
	public Date getMishDate() {
		return mishDate;
	}

	/**
	 * @param mishDate the mishDate to set
	 */
	public void setMishDate(Date mishDate) {
		this.mishDate = mishDate;
	}

	/**
	 * @return the mishT
	 */
	public List<String> getMishT() {
		return mishT;
	}

	/**
	 * @param mishT the mishT to set
	 */
	public void setMishT(List<String> mishT) {
		this.mishT = mishT;
	}

	/**
	 * @return the narrative
	 */
	public String getNarrative() {
		return narrative;
	}

	/**
	 * @param narrative the narrative to set
	 */
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	/**
	 * @return the nonDodPropCost
	 */
	public Double getNonDodPropCost() {
		return nonDodPropCost;
	}

	/**
	 * @param nonDodPropCost the nonDodPropCost to set
	 */
	public void setNonDodPropCost(Double nonDodPropCost) {
		this.nonDodPropCost = nonDodPropCost;
	}

	/**
	 * @return the notCountdRsnC
	 */
	public String getNotCountdRsnC() {
		return notCountdRsnC;
	}

	/**
	 * @param notCountdRsnC the notCountdRsnC to set
	 */
	public void setNotCountdRsnC(String notCountdRsnC) {
		this.notCountdRsnC = notCountdRsnC;
	}

	/**
	 * @return the onBaseI
	 */
	public String getOnBaseI() {
		return onBaseI;
	}

	/**
	 * @param onBaseI the onBaseI to set
	 */
	public void setOnBaseI(String onBaseI) {
		this.onBaseI = onBaseI;
	}

	/**
	 * @return the privNarr
	 */
	public String getPrivNarr() {
		return privNarr;
	}

	/**
	 * @param privNarr the privNarr to set
	 */
	public void setPrivNarr(String privNarr) {
		this.privNarr = privNarr;
	}

	/**
	 * @return the reportCatgC
	 */
	public String getReportCatgC() {
		return reportCatgC;
	}

	/**
	 * @param reportCatgC the reportCatgC to set
	 */
	public void setReportCatgC(String reportCatgC) {
		this.reportCatgC = reportCatgC;
	}

	/**
	 * @return the reportType
	 */
	public String getReportType() {
		return reportType;
	}

	/**
	 * @param reportType the reportType to set
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	/**
	 * @return the reportingUnit
	 */
	public String getReportingUnit() {
		return reportingUnit;
	}

	/**
	 * @param reportingUnit the reportingUnit to set
	 */
	public void setReportingUnit(String reportingUnit) {
		this.reportingUnit = reportingUnit;
	}

	/**
	 * @return the rprtblEventSerl
	 */
	public String getRprtblEventSerl() {
		return rprtblEventSerl;
	}

	/**
	 * @param rprtblEventSerl the rprtblEventSerl to set
	 */
	public void setRprtblEventSerl(String rprtblEventSerl) {
		this.rprtblEventSerl = rprtblEventSerl;
	}

	/**
	 * @return the rptCatg
	 */
	public String getRptCatg() {
		return rptCatg;
	}

	/**
	 * @param rptCatg the rptCatg to set
	 */
	public void setRptCatg(String rptCatg) {
		this.rptCatg = rptCatg;
	}

	/**
	 * @return the rptClass
	 */
	public String getRptClass() {
		return rptClass;
	}

	/**
	 * @param rptClass the rptClass to set
	 */
	public void setRptClass(String rptClass) {
		this.rptClass = rptClass;
	}

	/**
	 * @return the rptT
	 */
	public String getRptT() {
		return rptT;
	}

	/**
	 * @param rptT the rptT to set
	 */
	public void setRptT(String rptT) {
		this.rptT = rptT;
	}

	/**
	 * @return the shortNarr
	 */
	public String getShortNarr() {
		return shortNarr;
	}

	/**
	 * @param shortNarr the shortNarr to set
	 */
	public void setShortNarr(String shortNarr) {
		this.shortNarr = shortNarr;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the showInSearchEdit
	 */
	public Boolean getShowInSearchEdit() {
		return showInSearchEdit;
	}

	/**
	 * @param showInSearchEdit the showInSearchEdit to set
	 */
	public void setShowInSearchEdit(Boolean showInSearchEdit) {
		this.showInSearchEdit = showInSearchEdit;
	}

	/**
	 * @return the showInSearchTool
	 */
	public Boolean getShowInSearchTool() {
		return showInSearchTool;
	}

	/**
	 * @param showInSearchTool the showInSearchTool to set
	 */
	public void setShowInSearchTool(Boolean showInSearchTool) {
		this.showInSearchTool = showInSearchTool;
	}

}
