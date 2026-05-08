package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain;

import java.util.UUID;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.validator.ValidateVehiclePlate;

public class AddVehicleDomain {
	
	private UUID id;
	private String plate;
	private UUID vehicleType;
	private UUID owner;
	
	public AddVehicleDomain(String plate, UUID vehicleType, UUID owner) {
		super();
		generateId();
		setPlate(plate);
		setVehicleType(vehicleType);
		setOwner(owner);
	}

	public UUID getId() {
		return id;
	}
	
	private void generateId() {
		this.id = UUID.randomUUID();
	}
	
	public void regenerateId() {
		generateId();
	}
	
	public String getPlate() {
		return plate;
	}
	
	private void setPlate(final String plate) {
		ValidateVehiclePlate.executeValidation(plate);
		this.plate = plate;
	}
	
	public UUID getVehicleType() {
		return vehicleType;
	}
	
	private void setVehicleType(final UUID vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public UUID getOwner() {
		return owner;
	}
	
	private void setOwner(final UUID owner) {
		this.owner = owner;
	}

}
