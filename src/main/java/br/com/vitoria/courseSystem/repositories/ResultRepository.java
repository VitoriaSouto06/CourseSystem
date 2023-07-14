package br.com.vitoria.courseSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitoria.courseSystem.entities.Result;
import br.com.vitoria.courseSystem.entities.Student;

public interface ResultRepository extends JpaRepository<Result,Integer>{


}
