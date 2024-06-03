package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.entity;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime createdAt;
}
