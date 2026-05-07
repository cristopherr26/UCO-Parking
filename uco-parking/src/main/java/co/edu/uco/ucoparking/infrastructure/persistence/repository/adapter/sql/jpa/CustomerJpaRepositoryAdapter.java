package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.CustomerRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.CustomerJpaRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.CustomerJpaEntity;

@Repository
public class CustomerJpaRepositoryAdapter implements CustomerRepository {
	
	private final CustomerJpaRepository repository;
	
	public CustomerJpaRepositoryAdapter(CustomerJpaRepository repository) {
		this.repository = repository;
	}

	@Override
	public void create(CustomerEntity entity) {
		// CustomerEntity -> CustomerJPAEntity (MAPPER)
		CustomerJpaEntity jpaEntity = null;
		repository.save(jpaEntity);
		
	}

	@Override
	public void update(UUID id, CustomerEntity entity) {
		// CustomerEntity -> CustomerJPAEntity (MAPPER)
				CustomerJpaEntity jpaEntity = null;
				repository.save(jpaEntity);
		
	}

	@Override
	public void delete(UUID id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<CustomerEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerEntity> findByFilter(CustomerEntity filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
