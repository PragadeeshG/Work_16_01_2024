package com.test1;

public class PolicyStructure {
	private long id;
	private String versionDef;
	private String lanugageVersion;
	private String statement;
	private String sld;
	private String allowEffect;
	private String denyEffect;
	private String accountPrincipal;
	private String userPrincipal;
	private String rolePrincipal;
	private String actionList;
	private String resourceList;
	private String policyCondition;

	public PolicyStructure() {

	}

	public PolicyStructure(long id, String versionDef, String lanugageVersion, String statement, String sld,
			String allowEffect, String denyEffect, String accountPrincipal, String userPrincipal, String rolePrincipal,
			String actionList, String resourceList, String policyCondition) {
		super();
		this.id = id;
		this.versionDef = versionDef;
		this.lanugageVersion = lanugageVersion;
		this.statement = statement;
		this.sld = sld;
		this.allowEffect = allowEffect;
		this.denyEffect = denyEffect;
		this.accountPrincipal = accountPrincipal;
		this.userPrincipal = userPrincipal;
		this.rolePrincipal = rolePrincipal;
		this.actionList = actionList;
		this.resourceList = resourceList;
		this.policyCondition = policyCondition;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVersionDef() {
		return versionDef;
	}

	public void setVersionDef(String versionDef) {
		this.versionDef = versionDef;
	}

	public String getLanugageVersion() {
		return lanugageVersion;
	}

	public void setLanugageVersion(String lanugageVersion) {
		this.lanugageVersion = lanugageVersion;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getSld() {
		return sld;
	}

	public void setSld(String sld) {
		this.sld = sld;
	}

	public String getAllowEffect() {
		return allowEffect;
	}

	public void setAllowEffect(String allowEffect) {
		this.allowEffect = allowEffect;
	}

	public String getDenyEffect() {
		return denyEffect;
	}

	public void setDenyEffect(String denyEffect) {
		this.denyEffect = denyEffect;
	}

	public String getAccountPrincipal() {
		return accountPrincipal;
	}

	public void setAccountPrincipal(String accountPrincipal) {
		this.accountPrincipal = accountPrincipal;
	}

	public String getUserPrincipal() {
		return userPrincipal;
	}

	public void setUserPrincipal(String userPrincipal) {
		this.userPrincipal = userPrincipal;
	}

	public String getRolePrincipal() {
		return rolePrincipal;
	}

	public void setRolePrincipal(String rolePrincipal) {
		this.rolePrincipal = rolePrincipal;
	}

	public String getActionList() {
		return actionList;
	}

	public void setActionList(String actionList) {
		this.actionList = actionList;
	}

	public String getResourceList() {
		return resourceList;
	}

	public void setResourceList(String resourceList) {
		this.resourceList = resourceList;
	}

	public String getPolicyCondition() {
		return policyCondition;
	}

	public void setPolicyCondition(String policyCondition) {
		this.policyCondition = policyCondition;
	}

}
