package com.ameda.kisevu.Githubactions_cicd.namedQueries.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.namedQueries.entity.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface AuthorRepository extends JpaRepository<Author,Long> {
    Author findByNamedQuery(Long id);

    @Modifying
    void updateByNamedQuery(@Param("authorName") String authorName);
}
