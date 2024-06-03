package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.entity.ML;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MLRepo extends JpaRepository<ML,Long> {
}
