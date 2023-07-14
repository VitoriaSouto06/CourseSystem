package br.com.vitoria.courseSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitoria.courseSystem.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration,Integer>{

}
