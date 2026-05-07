package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleJpaEntity;

public interface VehicleJpaRepository
extends JpaRepository<VehicleJpaEntity, UUID>{

}
