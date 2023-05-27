package br.com.vitoria.courseSystem.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.vitoria.courseSystem.entities.Course;
import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.entities.Team;
import br.com.vitoria.courseSystem.entities.Test;
import br.com.vitoria.courseSystem.repositories.CourseRepository;
import br.com.vitoria.courseSystem.repositories.StudentRepository;
import br.com.vitoria.courseSystem.repositories.TeamRepository;
import br.com.vitoria.courseSystem.repositories.TestRepository;



@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired 
	private TeamRepository teamRepository;
	@Override
	public void run(String... args) throws Exception {
		Student s4 = new Student("Larissa","448694261445",Instant.parse("2000-04-12T19:53:07Z"));
		Student s5= new Student("Joana","42122731240",Instant.parse("2000-04-12T19:53:07Z"));
		
		
		Team team1 = new  Team(1,(Instant.parse("2022-07-12T19:53:07Z")),10);
		team1.getStudents().add(s4);
		team1.getStudents().add(s5);
		teamRepository.save(team1);
		
		Test t1 = new Test(5.0,(Instant.parse("2022-07-12T19:53:07Z")));
		t1.getStudents().addAll(Arrays.asList(s4,s5));
		s4.getTests().add(t1);
		s5.getTests().add(t1);
		studentRepository.saveAll(Arrays.asList(s4,s5));
		testRepository.save(t1);

		
	
		
	
	
		
		
		
	}

}
