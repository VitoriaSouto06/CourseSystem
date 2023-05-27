package br.com.vitoria.courseSystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.entities.Test;
import br.com.vitoria.courseSystem.services.TestService;

@RestController
@RequestMapping("/tests")
public class TestResource {
	
	@Autowired
	private TestService testService;
	
	@GetMapping
	public ResponseEntity<List<Test>> findAll(){
		List<Test> list = testService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Test> findById(@PathVariable Integer id){
		Test obj = testService.findById(id);
		return ResponseEntity.ok().body(obj);
	}


}
