package br.com.vitoria.courseSystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vitoria.courseSystem.entities.Team;
import br.com.vitoria.courseSystem.entities.Test;
import br.com.vitoria.courseSystem.repositories.TeamRepository;
import br.com.vitoria.courseSystem.repositories.TestRepository;

@Service
public class TeamService {


	@Autowired
	private TeamRepository teamRepository;
	
	public List<Team> findAll(){
		return teamRepository.findAll();
		
	}
	
	public Team findById(Integer id) {
		Optional<Team> obj = teamRepository.findById(id);
		return obj.get();
	}
}
