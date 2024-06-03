package com.ameda.kisevu.Githubactions_cicd.namedQueries.entity;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@NamedQuery(
        name="Author.findByNamedQuery",
        query ="select a from Author a where a.id= :id"
)
@NamedQuery(
        name = "Author.updateByNamedQuery",
        query ="update Author a set a.authorName=: authorName"
)
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String authorName;
    private LocalDateTime dateRegistered;
}
