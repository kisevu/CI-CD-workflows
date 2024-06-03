package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.entity.Kales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KalesRepo extends JpaRepository<Kales,Long> {
}
