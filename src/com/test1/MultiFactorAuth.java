package com.test1;

public class MultiFactorAuth {
	private long mfaId;
	private String userId;
	private String enablMFA;
	private String rootAccountProtection;
	private String securityDevice;
	private String securityQuestion1;
	private String answer1;
	private String securityQuestion2;
	private String answer2;

	public MultiFactorAuth() {

	}

	public MultiFactorAuth(long mfaId, String userId, String enablMFA, String rootAccountProtection,
			String securityDevice, String securityQuestion1, String answer1, String securityQuestion2, String answer2) {
		super();
		this.mfaId = mfaId;
		this.userId = userId;
		this.enablMFA = enablMFA;
		this.rootAccountProtection = rootAccountProtection;
		this.securityDevice = securityDevice;
		this.securityQuestion1 = securityQuestion1;
		this.answer1 = answer1;
		this.securityQuestion2 = securityQuestion2;
		this.answer2 = answer2;
	}

	public long getMfaId() {
		return mfaId;
	}

	public void setMfaId(long mfaId) {
		this.mfaId = mfaId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEnablMFA() {
		return enablMFA;
	}

	public void setEnablMFA(String enablMFA) {
		this.enablMFA = enablMFA;
	}

	public String getRootAccountProtection() {
		return rootAccountProtection;
	}

	public void setRootAccountProtection(String rootAccountProtection) {
		this.rootAccountProtection = rootAccountProtection;
	}

	public String getSecurityDevice() {
		return securityDevice;
	}

	public void setSecurityDevice(String securityDevice) {
		this.securityDevice = securityDevice;
	}

	public String getSecurityQuestion1() {
		return securityQuestion1;
	}

	public void setSecurityQuestion1(String securityQuestion1) {
		this.securityQuestion1 = securityQuestion1;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getSecurityQuestion2() {
		return securityQuestion2;
	}

	public void setSecurityQuestion2(String securityQuestion2) {
		this.securityQuestion2 = securityQuestion2;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

}
