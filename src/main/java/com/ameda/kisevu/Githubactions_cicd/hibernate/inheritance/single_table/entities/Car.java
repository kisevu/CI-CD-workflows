package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.entities;/*
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

@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "car_type",discriminatorType = DiscriminatorType.STRING)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private Long Id;
    private LocalDateTime createdAt;
}
