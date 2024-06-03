package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.mappersuperclass.entities;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
}
