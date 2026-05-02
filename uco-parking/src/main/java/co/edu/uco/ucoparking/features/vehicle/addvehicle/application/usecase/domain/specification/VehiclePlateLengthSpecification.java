package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.specification;

import co.edu.uco.ucoparking.crosscuting.specification.base.Specification;
import co.edu.uco.ucoparking.crosscutting.helper.TextHelper;

public final class VehiclePlateLengthSpecification extends Specification<String>{
	
	@Override
	public boolean isSatisfiedBy(final String value) {
		return TextHelper.lengthIsValidWithTrim(value, 2, 8);
	}

}
