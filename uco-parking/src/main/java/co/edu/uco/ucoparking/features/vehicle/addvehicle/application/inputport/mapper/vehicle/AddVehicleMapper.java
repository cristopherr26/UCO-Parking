package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper.vehicle;

import org.mapstruct.Mapper;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.application.inputport.mapper.DTOMapper;

@Mapper(componentModel = "spring")
public interface AddVehicleMapper extends DTOMapper<AddVehicleDTO, AddVehicleDomain> {

}
