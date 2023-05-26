package br.com.vitoria.courseSystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitoria.courseSystem.services.ClassService;
import br.com.vitoria.courseSystem.entities.Class;
@RestController
@RequestMapping("/classes")
public class ClassResource {

	@Autowired
	private ClassService classService;
	
	@GetMapping
	public ResponseEntity<List<Class>> findAll(){
		List<Class> list = classService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Class> findById(Integer id){
		Class c = classService.findById(id);
		return ResponseEntity.ok().body(c);
	}
	
	
	
	
	
}
