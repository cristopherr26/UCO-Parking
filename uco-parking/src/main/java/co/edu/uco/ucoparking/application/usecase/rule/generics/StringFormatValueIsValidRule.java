package co.edu.uco.ucoparking.application.usecase.rule.generics;

import co.edu.uco.ucoparking.application.usecase.rule.Rule;
import co.edu.uco.ucoparking.application.usecase.specification.generics.IsMandatorySpecification;
import co.edu.uco.ucoparking.application.usecase.specification.generics.StringFormatValueIsValidSpecification;
import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;

public class StringFormatValueIsValidRule implements Rule {
	
	private static final Rule instance = new StringFormatValueIsValidRule();

	private StringFormatValueIsValidRule() {
		
	}
	
	public static void executeRule(Object...data ) {
		instance.execute(data);
	}

	@Override
	public void execute(Object... data) {
		if (!new IsMandatorySpecification().isSatisfiedBy(data)) {
            var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
            var technicalMessage = MessagesEnum.TECHNICAL_ERROR_STRING_FORMAT_VALUE.getContent();
            throw UcoParkingException.create(userMessage, technicalMessage);
	    }
	
	    if (data.length < 4) {
	    		var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
	    		var technicalMessage = MessagesEnum.TECHNICAL_ERROR_WRONG_STRING_FORMAT_VALUE.getContent();
	    		throw UcoParkingException.create(userMessage, technicalMessage);
	    }
	
	    var stringData = (String) data[0];
	    var dataName = (String) data[1];
	    var pattern = (String) data[2];
	    boolean mustApplyTrim = (Boolean) data[3];
	
	    var formatSpecification = new StringFormatValueIsValidSpecification(pattern, mustApplyTrim);
	
	    if (!formatSpecification.isSatisfiedBy(stringData)) {
	    		var userMessage = MessagesEnum.USER_ERROR_WRONG_FORMAT.getContent() + dataName;
	 			var technicalMessage = MessagesEnum.TECHNICAL_ERROR_WRONG_FORMAT.getContent() + dataName + " " + pattern;
	 			throw UcoParkingException.create(userMessage, technicalMessage);
	    }
		
	}
	
}
