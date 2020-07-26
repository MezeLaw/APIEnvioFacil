package com.mz.APIEnvioFacil.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mz.APIEnvioFacil.model.ERole;
import com.mz.APIEnvioFacil.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Optional<Role> findByName(ERole name);

}
