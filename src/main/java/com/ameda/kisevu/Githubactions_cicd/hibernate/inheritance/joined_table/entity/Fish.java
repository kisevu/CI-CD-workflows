package com.ameda.kisevu.Githubactions_cicd.hibernate.inheritance.joined_table.entity;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@PrimaryKeyJoinColumn( name = "proteins")
public class Fish extends Food{
    private String foodType;
}
