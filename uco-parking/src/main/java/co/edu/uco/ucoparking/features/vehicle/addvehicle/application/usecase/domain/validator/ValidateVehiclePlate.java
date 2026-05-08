package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.validator;

import co.edu.uco.ucoparking.application.usecase.rule.generics.IsStringPresentRule;
import co.edu.uco.ucoparking.application.usecase.rule.generics.StringFormatValueIsValidRule;
import co.edu.uco.ucoparking.application.usecase.rule.generics.StringLengthValueIsValidRule;
import co.edu.uco.ucoparking.application.usecase.specification.generics.IsMandatorySpecification;
import co.edu.uco.ucoparking.application.usecase.validator.Validator;
import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;

public class ValidateVehiclePlate implements Validator {
	
private static final Validator instance = new ValidateVehiclePlate();
	
	private ValidateVehiclePlate() {
		
	}
	
	public static void executeValidation(Object... data) {
		instance.validate(data);
	}
	

	@Override
	public void validate(Object... data) {
		
		if (!new IsMandatorySpecification().isSatisfiedBy(data)) {
			var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
			var technicalMessage = MessagesEnum.TECHNICAL_ERROR_PLATE_IS_NOT_PRESENT.getContent();
			throw UcoParkingException.create(userMessage, technicalMessage);
		}
		
		if(data.length<1) {
			var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
			var technicalMessage = MessagesEnum.TECHNICAL_ERROR_WRONG_VEHICLE_LENGTH_VALUE_IS_NOT_PRESENT.getContent();
			throw UcoParkingException.create(userMessage, technicalMessage);
		}
		
		var plate = (String) data [0];
		
		validatePlate(plate);
		
	}
	
	private void validatePlate(String plate) {
		IsStringPresentRule.executeRule(plate, "Placa", true);
		StringFormatValueIsValidRule.executeRule(plate, "Placa", "^[A-Z]{3}\\d{3}$", true);
		StringLengthValueIsValidRule.executeRule(plate, "Placa", 6, 8, true);
	}

}
