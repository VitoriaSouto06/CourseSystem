package br.com.vitoria.courseSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoria.courseSystem.entities.Course;
import br.com.vitoria.courseSystem.repositories.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> findAll(){
		return courseRepository.findAll();
	}
	
	public Course findById(Integer id) {
		Optional<Course> c = courseRepository.findById(id);
		return c.get();
		
	}

}
