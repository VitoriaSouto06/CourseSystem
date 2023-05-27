package br.com.vitoria.courseSystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentResource {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public ResponseEntity<List<Student>> findAll(){
		List<Student> list = studentService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Student> findById(@PathVariable Integer id){
		Student obj = studentService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
