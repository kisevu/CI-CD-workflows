package com.ameda.kisevu.Githubactions_cicd;


import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.entity.Fish;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.entity.Kales;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.entity.Rice;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.repo.FishRepo;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.repo.KalesRepo;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.repo.RiceRepo;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.mappersuperclass.entities.Video;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.entities.Audi;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.entities.Mercedes;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.entities.Subaru;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.repo.AudiRepo;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.repo.MercedesRepo;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.repo.SubaruRepo;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.entity.AI;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.entity.ML;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.repo.AIRepo;
import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.repo.MLRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@SpringBootApplication
@RestController
public class GithubactionsCicdApplication {

	@Bean
	public CommandLineRunner commandLineRunner(
			MLRepo mlRepo,
			AIRepo aiRepo
	){
		return args -> {
			var ai = AI.builder()
					.description("Artificial Intelligence")
					.setAt(LocalDateTime.now())
					.build();
			aiRepo.save(ai);

			var ml = ML.builder()
					.description("Machine Learning")
					.setAt(LocalDateTime.now())
					.build();
			mlRepo.save(ml);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubactionsCicdApplication.class, args);
	}
}
