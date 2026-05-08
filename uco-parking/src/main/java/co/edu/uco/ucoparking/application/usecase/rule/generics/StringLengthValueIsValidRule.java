package co.edu.uco.ucoparking.application.usecase.rule.generics;

import co.edu.uco.ucoparking.application.usecase.rule.Rule;
import co.edu.uco.ucoparking.application.usecase.specification.generics.IsMandatorySpecification;
import co.edu.uco.ucoparking.application.usecase.specification.generics.StringLengthSpecification;
import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;

public class StringLengthValueIsValidRule implements Rule {
    
    private static final Rule instance = new StringLengthValueIsValidRule();
    
    private StringLengthValueIsValidRule() {}
    
    public static void executeRule(final Object... data) {
        instance.execute(data);
    }

    @Override
    public void execute(final Object... data) {
        if (!new IsMandatorySpecification().isSatisfiedBy(data)) {
                var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
                var technicalMessage = MessagesEnum.TECHNICAL_ERROR_STRING_LENGTH_VALUE.getContent();
                throw UcoParkingException.create(userMessage, technicalMessage);
        }

        if (data.length < 5) {
        		var userMessage = MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent();
        		var technicalMessage = MessagesEnum.TECHNICAL_ERROR_WRONG_STRING_LENGTH_VALUE.getContent();
        		throw UcoParkingException.create(userMessage, technicalMessage);
        }

        var stringData = (String) data[0];
        var dataName = (String) data[1];
        var minLength = (Integer) data[2];
        var maxLength = (Integer) data[3];
        boolean mustApplyTrim = (Boolean) data[4];

        var lengthSpecification = new StringLengthSpecification(minLength, maxLength, mustApplyTrim);

        if (!lengthSpecification.isSatisfiedBy(stringData)) {
        		var userMessage = MessagesEnum.USER_ERROR_WRONG_LENGTH.getContent() + dataName + " " + minLength + " y " +  maxLength;
     			var technicalMessage = MessagesEnum.TECHNICAL_ERROR_WRONG_LENGTH.getContent() + dataName + " " + minLength + " y " +  maxLength;
     			throw UcoParkingException.create(userMessage, technicalMessage);
        }
    }
}
