package br.com.vitoria.courseSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.entities.Test;
import br.com.vitoria.courseSystem.repositories.StudentRepository;
import br.com.vitoria.courseSystem.repositories.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;
	
	public List<Test> findAll(){
		return testRepository.findAll();
		
	}
	
	public Test findById(Integer id) {
		Optional<Test> obj = testRepository.findById(id);
		return obj.get();
	}
}
