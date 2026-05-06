package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.ucoparking.crosscutting.mapper.DTOMapper;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;

@Mapper(componentModel = "spring")
public interface AddVehicleMapper extends DTOMapper<AddVehicleDTO, AddVehicleDomain> {
	
	
}

