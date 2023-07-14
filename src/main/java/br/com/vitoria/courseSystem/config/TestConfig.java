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
import br.com.vitoria.courseSystem.entities.Registration;
import br.com.vitoria.courseSystem.entities.Result;
import br.com.vitoria.courseSystem.entities.Student;
import br.com.vitoria.courseSystem.entities.Team;
import br.com.vitoria.courseSystem.entities.Test;
import br.com.vitoria.courseSystem.repositories.CourseRepository;
import br.com.vitoria.courseSystem.repositories.RegistrationRepository;
import br.com.vitoria.courseSystem.repositories.ResultRepository;
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
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Autowired
	private ResultRepository resultRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		
		Student s4 = new Student("Larissa","448694261445",Instant.parse("2000-04-12T19:53:07Z"));
		Student s5= new Student("Joana","42122731240",Instant.parse("2000-04-12T19:53:07Z"));
		studentRepository.saveAll(Arrays.asList(s4,s5));
		
		
		Test t1 = new Test(5.0,(Instant.parse("2022-07-12T19:53:07Z")));
		testRepository.save(t1);
		s4.getTests().add(t1);
		s5.getTests().add(t1);
		studentRepository.saveAll(Arrays.asList(s4,s5));
		
		Team team1 = new  Team(1,(Instant.parse("2022-07-12T19:53:07Z")),10);
		team1.getStudents().add(s4);
		team1.getStudents().add(s5);
		Course c1 = new Course("Java",80,556.00,7.0);
		courseRepository.save(c1);
		team1.setCourse(c1);
		teamRepository.save(team1);
		
		c1.getTeams().add(team1);
		courseRepository.save(c1);
		courseRepository.save(c1);
	
		Registration r1 = new Registration();
		r1.setStudent(s5);
		r1.setTeam(team1);
		r1.setDateRegistration((Instant.parse("2022-06-12T19:53:07Z")));
		r1.setInstallments(6);
		
		Result r = new Result();
		r.setStudent(s5);
		r.setGrade(6.0);
		r.setTest(t1);
		resultRepository.save(r);
	
		Result r2 = new Result();
		r2.setStudent(s4);
		r2.setTest(t1);
		r2.setGrade(4.5);
		resultRepository.save(r2);
	
		
		
		
	}

}
