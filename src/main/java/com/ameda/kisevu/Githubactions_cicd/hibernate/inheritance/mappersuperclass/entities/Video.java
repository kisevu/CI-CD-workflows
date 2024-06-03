package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.mappersuperclass.entities;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor

public class Video extends Resource{
    private String type;
    private LocalDateTime createdTime;
}
