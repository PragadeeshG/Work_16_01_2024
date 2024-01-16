package com.test1;

public class PasswordPolicy {
	private long policyId;
	private Integer minLength;
	private String hasUpperCase;
	private String hasLowerCase;
	private String hasNonNumeric;
	private String hasNumbers;
	private String passwordChangeAllowed;
	private String passwordExpiration;
	private String passwordReuse;

	public PasswordPolicy() {

	}

	public PasswordPolicy(long policyId, Integer minLength, String hasUpperCase, String hasLowerCase,
			String hasNonNumeric, String hasNumbers, String passwordChangeAllowed, String passwordExpiration,
			String passwordReuse) {
		super();
		this.policyId = policyId;
		this.minLength = minLength;
		this.hasUpperCase = hasUpperCase;
		this.hasLowerCase = hasLowerCase;
		this.hasNonNumeric = hasNonNumeric;
		this.hasNumbers = hasNumbers;
		this.passwordChangeAllowed = passwordChangeAllowed;
		this.passwordExpiration = passwordExpiration;
		this.passwordReuse = passwordReuse;
	}

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public Integer getMinLength() {
		return minLength;
	}

	public void setMinLength(Integer minLength) {
		this.minLength = minLength;
	}

	public String getHasUpperCase() {
		return hasUpperCase;
	}

	public void setHasUpperCase(String hasUpperCase) {
		this.hasUpperCase = hasUpperCase;
	}

	public String getHasLowerCase() {
		return hasLowerCase;
	}

	public void setHasLowerCase(String hasLowerCase) {
		this.hasLowerCase = hasLowerCase;
	}

	public String getHasNonNumeric() {
		return hasNonNumeric;
	}

	public void setHasNonNumeric(String hasNonNumeric) {
		this.hasNonNumeric = hasNonNumeric;
	}

	public String getHasNumbers() {
		return hasNumbers;
	}

	public void setHasNumbers(String hasNumbers) {
		this.hasNumbers = hasNumbers;
	}

	public String getPasswordChangeAllowed() {
		return passwordChangeAllowed;
	}

	public void setPasswordChangeAllowed(String passwordChangeAllowed) {
		this.passwordChangeAllowed = passwordChangeAllowed;
	}

	public String getPasswordExpiration() {
		return passwordExpiration;
	}

	public void setPasswordExpiration(String passwordExpiration) {
		this.passwordExpiration = passwordExpiration;
	}

	public String getPasswordReuse() {
		return passwordReuse;
	}

	public void setPasswordReuse(String passwordReuse) {
		this.passwordReuse = passwordReuse;
	}

}
