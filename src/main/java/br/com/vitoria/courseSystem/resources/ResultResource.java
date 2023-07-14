package br.com.vitoria.courseSystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitoria.courseSystem.entities.Result;
import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.services.ResultService;
import br.com.vitoria.courseSystem.services.StudentService;

@RestController
@RequestMapping("/results")
public class ResultResource {
	@Autowired
	private ResultService resultService;
	
	@GetMapping
	public ResponseEntity<List<Result>> findAll(){
		List<Result> list = resultService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Result> findById(@PathVariable Integer id){
		Result obj = resultService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
