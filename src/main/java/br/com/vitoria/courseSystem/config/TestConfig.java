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
import br.com.vitoria.courseSystem.entities.Test;
import br.com.vitoria.courseSystem.repositories.CourseRepository;
import br.com.vitoria.courseSystem.repositories.StudentRepository;
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
	
	
	@Override
	public void run(String... args) throws Exception {
		
	
		
		
		
	}

}
