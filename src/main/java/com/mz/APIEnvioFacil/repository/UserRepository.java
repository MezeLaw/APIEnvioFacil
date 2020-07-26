package com.mz.APIEnvioFacil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mz.APIEnvioFacil.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/** Simplifico a este metodo solamente porque la onda sera email, pass **/

	public Boolean existsByEmail(String email);

	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String userName);

}
