package com.ameda.kisevu.Githubactions_cicd;


import com.ameda.kisevu.Githubactions_cicd.composite_key.entity.Address;
import com.ameda.kisevu.Githubactions_cicd.composite_key.entity.Order;
import com.ameda.kisevu.Githubactions_cicd.composite_key.entity.OrderId;
import com.ameda.kisevu.Githubactions_cicd.composite_key.repo.OrderRepository;
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
import com.ameda.kisevu.Githubactions_cicd.namedQueries.entity.Author;
import com.ameda.kisevu.Githubactions_cicd.namedQueries.repo.AuthorRepository;
import com.ameda.kisevu.Githubactions_cicd.specification.entity.Person;
import com.ameda.kisevu.Githubactions_cicd.specification.repo.PersonRepository;
import com.ameda.kisevu.Githubactions_cicd.specification.specification.PersonSpecification;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootApplication
@RestController
@Slf4j
public class GithubactionsCicdApplication {

	@Bean
	public CommandLineRunner commandLineRunner(
			PersonRepository personRepository
	){
		return args -> {
			Faker faker = new Faker();
//			var author = Author.builder()
//					.authorName("ameda")
//					.dateRegistered(LocalDateTime.now())
//					.build();
//			authorRepository.save(author);
//			author = authorRepository.findByNamedQuery(author.getId());
//			authorRepository.updateByNamedQuery("oscar");
			var person = Person.builder()
					.name(faker.name().name())
					.city(faker.nation().capitalCity())
					.age(faker.number().numberBetween(10,25))
					.build();
			personRepository.save(person);

			Specification<Person> spec = Specification
					.where(PersonSpecification.hasAge(15))
					.and(PersonSpecification.nameLike("Tama Torp"));
			List<Person> people = personRepository.findAll(spec);
		};

	}

	public static void main(String[] args) {
		SpringApplication.run(GithubactionsCicdApplication.class, args);
	}
}
