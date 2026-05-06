package co.edu.uco.ucoparking.business.rule.generics;

import co.edu.uco.ucoparking.crosscutting.exception.UcoParkingException;
import co.edu.uco.ucoparking.crosscutting.messagescatalog.MessagesEnum;
import co.edu.uco.ucoparking.crosscutting.rule.Rule;
import co.edu.uco.ucoparking.crosscutting.specification.generics.IsMandatorySpecification;
import co.edu.uco.ucoparking.crosscutting.specification.generics.StringLengthSpecification;

public class StringLengthValueIsValidRule implements Rule {
    
    private static final Rule instance = new StringLengthValueIsValidRule();
    
    private StringLengthValueIsValidRule() {}
    
    public static void executeRule(final Object... data) {
        instance.execute(data);
    }

    @Override
    public void execute(final Object... data) {
        if (!new IsMandatorySpecification().isSatisfiedBy(data)) {
            //throw UcoParkingException.create(
                //MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent(),
                //MessagesEnum.TECHNICAL_ERROR_STRING_LENGTH_VALUE.getContent());
        }

        if (data.length < 5) {
        	 //throw UcoParkingException.create(
            //MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent(),
            //MessagesEnum.TECHNICAL_ERROR_STRING_LENGTH_VALUE.getContent());
        }

        var stringData = (String) data[0];
        var dataName = (String) data[1];
        var minLength = (Integer) data[2];
        var maxLength = (Integer) data[3];
        boolean mustApplyTrim = (Boolean) data[4];

        var lengthSpec = new StringLengthSpecification(minLength, maxLength, mustApplyTrim);

        if (!lengthSpec.isSatisfiedBy(stringData)) {
        	 //throw UcoParkingException.create(
            //MessagesEnum.USER_ERROR_TRYING_TO_MAKE_AN_OPERATION.getContent(),
            //MessagesEnum.TECHNICAL_ERROR_STRING_LENGTH_VALUE.getContent());
        }
    }
}
