package com.Management.OrganizationEntity;

public class OrganizationEntity {

	private int organizationId;
	
	
	private String name;
	
	

	public OrganizationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public OrganizationEntity(int organizationId, String name) {
		super();
		this.organizationId = organizationId;
		this.name = name;
	}



	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
