package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.table_per_class.entity;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class AI extends Course{
    private String description;
}
