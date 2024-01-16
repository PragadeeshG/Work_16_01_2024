package com.test1;

public class IamPermisson {
	private long documentId;
	private String jsonDoc;
	private String policies;
	private boolean permissionPolicy;
	private boolean privilegePrinciple;
	private String version;
	private String statement;
	private String effect;
	private String action;
	private String resources;
	private boolean multiDoc;

	public IamPermisson() {

	}

	public IamPermisson(long documentId, String jsonDoc, String policies, boolean permissionPolicy,
			boolean privilegePrinciple, String version, String statement, String effect, String action,
			String resources, boolean multiDoc) {
		super();
		this.documentId = documentId;
		this.jsonDoc = jsonDoc;
		this.policies = policies;
		this.permissionPolicy = permissionPolicy;
		this.privilegePrinciple = privilegePrinciple;
		this.version = version;
		this.statement = statement;
		this.effect = effect;
		this.action = action;
		this.resources = resources;
		this.multiDoc = multiDoc;
	}

	public long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	public String getJsonDoc() {
		return jsonDoc;
	}

	public void setJsonDoc(String jsonDoc) {
		this.jsonDoc = jsonDoc;
	}

	public String getPolicies() {
		return policies;
	}

	public void setPolicies(String policies) {
		this.policies = policies;
	}

	public boolean isPermissionPolicy() {
		return permissionPolicy;
	}

	public void setPermissionPolicy(boolean permissionPolicy) {
		this.permissionPolicy = permissionPolicy;
	}

	public boolean isPrivilegePrinciple() {
		return privilegePrinciple;
	}

	public void setPrivilegePrinciple(boolean privilegePrinciple) {
		this.privilegePrinciple = privilegePrinciple;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public boolean isMultiDoc() {
		return multiDoc;
	}

	public void setMultiDoc(boolean multiDoc) {
		this.multiDoc = multiDoc;
	}

}
