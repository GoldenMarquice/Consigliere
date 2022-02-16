package com.consigliere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.consigliere.entity.Consigliere;

@Repository
public interface ConsigliereRepository extends JpaRepository <Consigliere, String> {

	@Query("SELECT C FROM Consigliere C WHERE C.email = ?1 AND C.password = ?2")
	Consigliere findConsigliereLogIn(String email, String password);
		
	}
	


