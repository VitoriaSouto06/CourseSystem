package br.com.vitoria.courseSystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitoria.courseSystem.entities.Registration;
import br.com.vitoria.courseSystem.entities.Result;
import br.com.vitoria.courseSystem.services.RegistrationService;
import br.com.vitoria.courseSystem.services.ResultService;
@RestController
@RequestMapping("/registrations")
public class RegistrationResource {
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping
	public ResponseEntity<List<Registration>> findAll(){
		List<Registration> list = registrationService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Registration> findById(@PathVariable Integer id){
		Registration obj = registrationService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
