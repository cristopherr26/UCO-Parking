package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.AddVehicleUseCase;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.CustomerRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;

@Service
public class AddVehicleUseCaseImpl implements AddVehicleUseCase {
	
	private VehicleRepository vehicleRepository;
	private CustomerRepository customerRepository;
	
	public AddVehicleUseCaseImpl(VehicleRepository vehicleRepository, CustomerRepository customerRepository) {
		this.vehicleRepository = vehicleRepository;
		this.customerRepository = customerRepository;
	}

	@Override
	public Void execute(AddVehicleDomain data) {
		VehicleEntity vehicleEntity = null; // AddVehicleDomain -> VehicleEntity  Mapper
		vehicleRepository.create(vehicleEntity);
		return null;
	}

}
