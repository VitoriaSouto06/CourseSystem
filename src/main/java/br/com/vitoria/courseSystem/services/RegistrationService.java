package br.com.vitoria.courseSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoria.courseSystem.entities.Registration;
import br.com.vitoria.courseSystem.entities.Result;
import br.com.vitoria.courseSystem.repositories.RegistrationRepository;
import br.com.vitoria.courseSystem.repositories.ResultRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public List<Registration> findAll(){
		return registrationRepository.findAll();
	}
	
	public Registration findById(Integer id) {
		Optional<Registration> c = registrationRepository.findById(id);
		return c.get();
		
	}
}
