package com.boot.dev.ops.test.TestApl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.dev.ops.test.TestApl.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

	Shipwreck getShipwreckById(Long id);
	
}
