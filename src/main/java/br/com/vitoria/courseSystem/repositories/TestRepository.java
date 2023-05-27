package br.com.vitoria.courseSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.entities.Test;

public interface TestRepository extends JpaRepository<Test,Integer>{

}
