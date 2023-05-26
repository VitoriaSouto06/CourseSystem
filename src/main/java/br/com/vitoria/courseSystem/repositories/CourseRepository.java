package br.com.vitoria.courseSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitoria.courseSystem.entities.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{

}
