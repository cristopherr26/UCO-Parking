package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscuting.specification.base.Specification;
import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.specification.VehiclePlateDataTypeSpecification;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.specification.VehiclePlateFormatSpecification;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.specification.VehiclePlateIsMandatorySpecification;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.specification.VehiclePlateLengthSpecification;

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
		Specification<String> plateRules= new VehiclePlateDataTypeSpecification()
				.and(new VehiclePlateFormatSpecification())
				.and(new VehiclePlateIsMandatorySpecification())
				.and(new VehiclePlateLengthSpecification());
		
		if (!plateRules.isSatisfiedBy(plate)) {
			var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_ADD_NEW_VEHICLE.getContent();
			var technicalMessage = MessagesEnum.TECHNICAL_ERROR_TRYING_TO_ADD_NEW_VEHICLE.getContent();
			throw UcoParkingException.create(userMessage, technicalMessage);
	    }
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
