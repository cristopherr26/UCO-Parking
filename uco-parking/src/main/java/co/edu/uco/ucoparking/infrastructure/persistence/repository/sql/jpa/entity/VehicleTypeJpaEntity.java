package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicleType")
public class VehicleTypeJpaEntity {
	
	public VehicleTypeJpaEntity(UUID id, String name) {
		super();
		setId(id);
		setName(name);
	}

	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "name")
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
