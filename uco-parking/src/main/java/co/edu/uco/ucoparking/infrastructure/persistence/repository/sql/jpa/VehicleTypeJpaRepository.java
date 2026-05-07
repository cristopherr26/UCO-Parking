package co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleTypeJpaEntity;

public interface VehicleTypeJpaRepository
extends JpaRepository<VehicleTypeJpaEntity, UUID> {

}
