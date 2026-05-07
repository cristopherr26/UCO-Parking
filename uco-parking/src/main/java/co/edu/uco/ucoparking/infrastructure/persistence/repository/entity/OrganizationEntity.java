package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;

public class OrganizationEntity {
	
	public OrganizationEntity(UUID id, String name) {
		super();
		setId(id);
		setName(name);
	}

	private UUID id;
	
	private String name;

	public UUID getId() {
		return id;
	}

	private void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	

}
