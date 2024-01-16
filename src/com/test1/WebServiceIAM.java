package com.test1;

public class WebServiceIAM {
	private String identityManagement;
	private String accessManagement;
	private String globalService;
	private String orgUser;
	private Integer outsideOrgUser;
	private Integer groupUser;
	private String rootAccount;
	private String privilege;
	private String canBeShared;
	private String fullAccess;

	public WebServiceIAM() {

	}

	public WebServiceIAM(String identityManagement, String accessManagement, String globalService, String orgUser,
			Integer outsideOrgUser, Integer groupUser, String rootAccount, String privilege, String canBeShared,
			String fullAccess) {
		super();
		this.identityManagement = identityManagement;
		this.accessManagement = accessManagement;
		this.globalService = globalService;
		this.orgUser = orgUser;
		this.outsideOrgUser = outsideOrgUser;
		this.groupUser = groupUser;
		this.rootAccount = rootAccount;
		this.privilege = privilege;
		this.canBeShared = canBeShared;
		this.fullAccess = fullAccess;
	}

	public String getIdentityManagement() {
		return identityManagement;
	}

	public void setIdentityManagement(String identityManagement) {
		this.identityManagement = identityManagement;
	}

	public String getAccessManagement() {
		return accessManagement;
	}

	public void setAccessManagement(String accessManagement) {
		this.accessManagement = accessManagement;
	}

	public String getGlobalService() {
		return globalService;
	}

	public void setGlobalService(String globalService) {
		this.globalService = globalService;
	}

	public String getOrgUser() {
		return orgUser;
	}

	public void setOrgUser(String orgUser) {
		this.orgUser = orgUser;
	}

	public Integer getOutsideOrgUser() {
		return outsideOrgUser;
	}

	public void setOutsideOrgUser(Integer outsideOrgUser) {
		this.outsideOrgUser = outsideOrgUser;
	}

	public Integer getGroupUser() {
		return groupUser;
	}

	public void setGroupUser(Integer groupUser) {
		this.groupUser = groupUser;
	}

	public String getRootAccount() {
		return rootAccount;
	}

	public void setRootAccount(String rootAccount) {
		this.rootAccount = rootAccount;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getCanBeShared() {
		return canBeShared;
	}

	public void setCanBeShared(String canBeShared) {
		this.canBeShared = canBeShared;
	}

	public String getFullAccess() {
		return fullAccess;
	}

	public void setFullAccess(String fullAccess) {
		this.fullAccess = fullAccess;
	}

}
