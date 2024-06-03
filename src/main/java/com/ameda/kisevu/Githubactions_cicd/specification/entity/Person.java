package com.ameda.kisevu.Githubactions_cicd.specification.entity;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private Integer age;
}
