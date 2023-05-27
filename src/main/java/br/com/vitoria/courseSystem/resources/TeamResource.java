package br.com.vitoria.courseSystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitoria.courseSystem.entities.Team;
import br.com.vitoria.courseSystem.entities.Test;
import br.com.vitoria.courseSystem.services.TeamService;
import br.com.vitoria.courseSystem.services.TestService;

@RestController
@RequestMapping("/teams")
public class TeamResource {

	@Autowired
	private TeamService teamService;
	
	@GetMapping
	public ResponseEntity<List<Team>> findAll(){
		List<Team> list = teamService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Team> findById(@PathVariable Integer id){
		Team obj = teamService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
