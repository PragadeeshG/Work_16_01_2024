package com.test1;

public class AccessToAccount {
	private String userId;
	private String managementConsoleeAccess;
	private String sdkAccess;
	private String cliAccess;
	private String accessKeyEnabled;
	private String acessKeyExpiry;
	private String acessKeyId;
	private String secretAccessKey;

	public AccessToAccount() {

	}

	public AccessToAccount(String userId, String managementConsoleeAccess, String sdkAccess, String cliAccess,
			String accessKeyEnabled, String acessKeyExpiry, String acessKeyId, String secretAccessKey) {
		super();
		this.userId = userId;
		this.managementConsoleeAccess = managementConsoleeAccess;
		this.sdkAccess = sdkAccess;
		this.cliAccess = cliAccess;
		this.accessKeyEnabled = accessKeyEnabled;
		this.acessKeyExpiry = acessKeyExpiry;
		this.acessKeyId = acessKeyId;
		this.secretAccessKey = secretAccessKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getManagementConsoleeAccess() {
		return managementConsoleeAccess;
	}

	public void setManagementConsoleeAccess(String managementConsoleeAccess) {
		this.managementConsoleeAccess = managementConsoleeAccess;
	}

	public String getSdkAccess() {
		return sdkAccess;
	}

	public void setSdkAccess(String sdkAccess) {
		this.sdkAccess = sdkAccess;
	}

	public String getCliAccess() {
		return cliAccess;
	}

	public void setCliAccess(String cliAccess) {
		this.cliAccess = cliAccess;
	}

	public String getAccessKeyEnabled() {
		return accessKeyEnabled;
	}

	public void setAccessKeyEnabled(String accessKeyEnabled) {
		this.accessKeyEnabled = accessKeyEnabled;
	}

	public String getAcessKeyExpiry() {
		return acessKeyExpiry;
	}

	public void setAcessKeyExpiry(String acessKeyExpiry) {
		this.acessKeyExpiry = acessKeyExpiry;
	}

	public String getAcessKeyId() {
		return acessKeyId;
	}

	public void setAcessKeyId(String acessKeyId) {
		this.acessKeyId = acessKeyId;
	}

	public String getSecretAccessKey() {
		return secretAccessKey;
	}

	public void setSecretAccessKey(String secretAccessKey) {
		this.secretAccessKey = secretAccessKey;
	}

}
