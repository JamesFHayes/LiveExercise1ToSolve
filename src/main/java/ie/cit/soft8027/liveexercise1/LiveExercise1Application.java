package ie.cit.soft8027.liveexercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import ie.cit.soft8027.liveexercise1.entity.Module;
import ie.cit.soft8027.liveexercise1.repository.ModuleRepository;
import ie.cit.soft8027.liveexercise1.service.LearningService;

@SpringBootApplication
public class LiveExercise1Application implements CommandLineRunner {

	@Autowired
	private LearningService learningService;
	
	public static void main(String[] args) {
		SpringApplication.run(LiveExercise1Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		System.out.println("Live Exercise Output:\n");

		// List all modules and their learning outcomes
		for (Module m : learningService.getAllModules()) {
			learningService.populateLearningOutcomes(m);
			System.out.println(m.toString());
		}
		
	}
}
