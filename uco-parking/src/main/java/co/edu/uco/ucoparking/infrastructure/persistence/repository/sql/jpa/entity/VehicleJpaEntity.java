package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class VehicleJpaEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "plate")
	private String plate;
	
	@ManyToOne
	@JoinColumn(name= "vehicleType")
	private VehicleJpaEntity vehicleType;
	
	@ManyToOne
	@JoinColumn(name = "owner")
	private CustomerJpaEntity owner;
	

	public VehicleJpaEntity(UUID id, String plate, VehicleJpaEntity vehicleType, CustomerJpaEntity owner) {
		super();
		setId(id);
		setPlate(plate);
		setVehicleType(vehicleType);
		setOwner(owner);
	}

	public UUID getId() {
		return id;
	}

	private void setId(UUID id) {
		this.id = id;
	}

	public String getPlate() {
		return plate;
	}

	private void setPlate(String plate) {
		this.plate = plate;
	}

	public VehicleJpaEntity getVehicleType() {
		return vehicleType;
	}

	private void setVehicleType(VehicleJpaEntity vehicleType) {
		this.vehicleType = vehicleType;
	}

	public CustomerJpaEntity getOwner() {
		return owner;
	}

	private void setOwner(CustomerJpaEntity owner) {
		this.owner = owner;
	}
	
	

}
