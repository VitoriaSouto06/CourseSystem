package br.com.vitoria.courseSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> findAll(){
		return studentRepository.findAll();
		
	}
	
	public Student findById(Integer id) {
		Optional<Student> obj = studentRepository.findById(id);
		return obj.get();
	}
}
