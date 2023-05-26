package br.com.vitoria.courseSystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.vitoria.courseSystem.entities.Course;
import br.com.vitoria.courseSystem.repositories.ClassRepository;
import br.com.vitoria.courseSystem.repositories.CourseRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private ClassRepository classRepository;
	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course("MySQL",40,1000.00,7.0);
		Course c2 = new Course("Java",70,950.00,7.0);
		Course c3 = new Course("Python",70,900.00,7.0);
		courseRepository.saveAll(Arrays.asList(c1,c2,c3));
		
	}

}
