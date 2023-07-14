package br.com.vitoria.courseSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoria.courseSystem.entities.Course;
import br.com.vitoria.courseSystem.entities.Result;
import br.com.vitoria.courseSystem.repositories.CourseRepository;
import br.com.vitoria.courseSystem.repositories.ResultRepository;
@Service
public class ResultService {
	@Autowired
	private ResultRepository resultRepository;
	
	public List<Result> findAll(){
		return resultRepository.findAll();
	}
	
	public Result findById(Integer id) {
		Optional<Result> c = resultRepository.findById(id);
		return c.get();
		
	}

}
