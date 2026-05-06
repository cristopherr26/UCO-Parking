package co.edu.uco.ucoparking.crosscutting.specification.generics;

import co.edu.uco.ucoparking.crosscutting.helper.TextHelper;
import co.edu.uco.ucoparking.crosscutting.specification.base.Specification;

public class IsStringValuePresentSpecification extends Specification<String> {
	
	private final boolean mustApplyTrim;

	public IsStringValuePresentSpecification(boolean mustAplyTrim) {
		super();
		this.mustApplyTrim = mustAplyTrim;
	}


	@Override
	public boolean isSatisfiedBy(String data) {
		return !((mustApplyTrim)
				? TextHelper.isEmptyWithTrim(data)
						:TextHelper.isEmpty(data));
	}

}
