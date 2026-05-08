package co.edu.uco.ucoparking.application.usecase.specification.generics;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscutting.helper.UUIDHelper;
import co.edu.uco.ucoparking.crosscutting.specification.base.Specification;

public class IsUUIDPresentSpecification extends Specification<UUID> {

	@Override
	public boolean isSatisfiedBy(UUID data) {
		return !UUIDHelper.getUUIDHelper().isDefaultUUID(data);
	}

}
