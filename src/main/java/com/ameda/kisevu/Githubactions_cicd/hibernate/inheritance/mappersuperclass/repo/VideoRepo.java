package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.mappersuperclass.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.mappersuperclass.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepo extends JpaRepository<Video,Long> {
}
