package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;

@Mapper
public interface AddVehicleMapper {
	
	AddVehicleMapper mapper = Mappers.getMapper(AddVehicleMapper.class);
	
	@Mapping(source = "plate", target = "plate")
	AddVehicleDomain toAddVehicleDomain(AddVehicleDTO addVehicleDTO);
	
	@Mapping(source = "plate", target = "plate")
	AddVehicleDTO toAddVehicleDTO(AddVehicleDomain addVehicleDomain);
	

}
