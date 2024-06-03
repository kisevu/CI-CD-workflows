package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.single_table.entities;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue(value = "subaru")
public class Subaru extends Car{
    private String model;
}
