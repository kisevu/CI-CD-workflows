package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.entities.Mercedes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MercedesRepo extends JpaRepository<Mercedes,Long> {
}