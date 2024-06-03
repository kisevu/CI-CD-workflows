package com.ameda.kisevu.Githubactions_cicd.specification.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/


import com.ameda.kisevu.Githubactions_cicd.specification.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> , JpaSpecificationExecutor<Person> {
}
