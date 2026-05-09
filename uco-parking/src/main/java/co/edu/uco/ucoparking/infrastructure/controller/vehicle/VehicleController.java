package co.edu.uco.ucoparking.infrastructure.controller.vehicle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.AddVehicleInputPort;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.infrastructure.controller.Response;

@RestController
@RequestMapping("/api/ucoparking/vehicle")
public class VehicleController {
	
	private final AddVehicleInputPort inputPort;

	public VehicleController(AddVehicleInputPort inputPort) {
		super();
		this.inputPort = inputPort;
	}
	
	@PostMapping
	public ResponseEntity<Response<AddVehicleDTO>> execute(@RequestBody AddVehicleDTO vehicle) {

        Response<AddVehicleDTO> responseObjectData = Response.createSuccededResponse();
        HttpStatus responseStatusCode = HttpStatus.OK;

        try {
        	
            inputPort.execute(vehicle);
            
            responseObjectData.addMessage(MessagesEnum.VEHICLE_SUCESSFULLY_REGISTERED.getContent());
            responseStatusCode = HttpStatus.CREATED;

        } catch (final UcoParkingException exception) {
            responseObjectData = Response.createFailedResponse();
            responseObjectData.addMessage(exception.getUserMessage());
            responseStatusCode = HttpStatus.BAD_REQUEST;
            
        } catch (final Exception exception) {
            var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
            responseObjectData = Response.createFailedResponse();
            responseObjectData.addMessage(userMessage);
            responseStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
            exception.printStackTrace();
        }

        return new ResponseEntity<>(responseObjectData, responseStatusCode);
    }
	
}
