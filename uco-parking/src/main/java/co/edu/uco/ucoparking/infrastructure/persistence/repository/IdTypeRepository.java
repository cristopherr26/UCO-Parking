package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;

public interface IdTypeRepository {
	
	void update(UUID id, IdTypeEntity entity);
	
	void delete(UUID id);
	
	List<IdTypeEntity> findAll();
	
	List<IdTypeEntity> findByFilter(IdTypeEntity filter);
	
	IdTypeEntity findById(UUID id);

}
