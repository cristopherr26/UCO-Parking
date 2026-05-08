package co.edu.uco.ucoparking.application.usecase.rule.generics;

import java.util.UUID;

import co.edu.uco.ucoparking.application.usecase.rule.Rule;
import co.edu.uco.ucoparking.application.usecase.specification.generics.IsMandatorySpecification;
import co.edu.uco.ucoparking.application.usecase.specification.generics.IsUUIDPresentSpecification;
import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;

public class IsUUIDPresentRule implements Rule {
	
	private static final Rule instance = new IsUUIDPresentRule();
	
	private IsUUIDPresentRule() {
		
	}
	
	public static void executeRule(Object...data) {
		instance.execute(data);
	}

	@Override
	public void execute(Object... data) {
		if(!new IsMandatorySpecification().isSatisfiedBy(data)) {
			var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
            var technicalMessage = MessagesEnum.TECHNICAL_ERROR_STRING_FORMAT_VALUE.getContent();
            throw UcoParkingException.create(userMessage, technicalMessage);
	    }
	
	    if (data.length < 2) {
	    		var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
	    		var technicalMessage = MessagesEnum.TECHNICAL_ERROR_WRONG_STRING_LENGTH_IS_PRESENT.getContent();
	    		throw UcoParkingException.create(userMessage, technicalMessage);
		}
	    
	    var uuidData = (UUID) data [0];
	    var dataName = (String) data [1];
	    
	    var isUUIDPresentSpecification = new IsUUIDPresentSpecification();
	    
	    if(!isUUIDPresentSpecification.isSatisfiedBy(uuidData)) {
	    	var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
	    	var technicalMessage = MessagesEnum.TECHNICAL_ERROR_UUID_IS_DEFAULT.getContent() + " " + dataName;
	    	UcoParkingException.create(userMessage, technicalMessage);
	    }
		
	}

}
