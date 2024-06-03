package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.entity;/*
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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime setAt;
}
