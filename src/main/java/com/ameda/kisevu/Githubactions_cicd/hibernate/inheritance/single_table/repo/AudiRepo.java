package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.entities.Audi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiRepo extends JpaRepository<Audi,Long> {
}
