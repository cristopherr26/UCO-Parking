package co.edu.uco.ucoparking.application.usecase.rule.generics;

import co.edu.uco.ucoparking.application.usecase.rule.Rule;
import co.edu.uco.ucoparking.application.usecase.specification.generics.IsMandatorySpecification;
import co.edu.uco.ucoparking.application.usecase.specification.generics.IsStringValuePresentSpecification;
import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;

public class IsStringPresentRule implements Rule {
	
	private static final Rule instance = new IsStringPresentRule();
	
	private IsStringPresentRule() {
		
	}
	
	public static void executeRule (Object... data) {
		instance.execute(data);
	}

	@Override
	public void execute(Object... data) {
		if(!new IsMandatorySpecification().isSatisfiedBy(data)) {
			var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
            var technicalMessage = MessagesEnum.TECHNICAL_ERROR_STRING_FORMAT_VALUE.getContent();
            throw UcoParkingException.create(userMessage, technicalMessage);
	    }
	
	    if (data.length < 3) {
	    		var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
	    		var technicalMessage = MessagesEnum.TECHNICAL_ERROR_WRONG_STRING_LENGTH_IS_PRESENT.getContent();
	    		throw UcoParkingException.create(userMessage, technicalMessage);
		}
	    
	    var stringData = (String) data[0];
		var dataName = (String) data[1];
		boolean mustApplyTrim = (Boolean) data[2];
		
		var isStringValuePresent = new IsStringValuePresentSpecification(mustApplyTrim);
		
		if(!isStringValuePresent.isSatisfiedBy(stringData)) {
			var userMessage = MessagesEnum.USER_ERROR_INCOMPLETE_PARAMETERS.getContent() + dataName;
 			var technicalMessage = MessagesEnum.TECHNICAL_ERROR_INCOMPLETE_PARAMETERS.getContent() + dataName;
 			throw UcoParkingException.create(userMessage, technicalMessage);
		}
		
	}

}
