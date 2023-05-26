package br.com.vitoria.courseSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoria.courseSystem.entities.Class;
import br.com.vitoria.courseSystem.repositories.ClassRepository;

@Service
public class ClassService {
	@Autowired
	private ClassRepository classRepository;
	
	public List<Class> findAll(){
		return classRepository.findAll();
	}
	
	public Class findById(Integer id) {
		Optional<Class> c = classRepository.findById(id);
		return c.get();
	}

}
