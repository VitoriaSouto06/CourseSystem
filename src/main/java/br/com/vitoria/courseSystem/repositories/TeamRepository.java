package br.com.vitoria.courseSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.vitoria.courseSystem.entities.Team;

public interface TeamRepository extends JpaRepository<Team,Integer>{

}