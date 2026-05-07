package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;

public class VehicleEntity {
	
	private UUID id;
	
	private String plate;
	
	private VehicleEntity vehicleType;
	
	private CustomerEntity owner;
	

	public VehicleEntity(UUID id, String plate, VehicleEntity vehicleType, CustomerEntity owner) {
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

	public VehicleEntity getVehicleType() {
		return vehicleType;
	}

	private void setVehicleType(VehicleEntity vehicleType) {
		this.vehicleType = vehicleType;
	}

	public CustomerEntity getOwner() {
		return owner;
	}

	private void setOwner(CustomerEntity owner) {
		this.owner = owner;
	}

}
