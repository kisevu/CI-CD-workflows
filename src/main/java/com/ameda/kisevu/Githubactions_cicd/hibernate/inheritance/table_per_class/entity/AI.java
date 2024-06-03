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
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
// annotation to handle polymorphic issues
//When we only wanna query the base without having the child added to it via a union
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class AI extends Course{
    private String description;
}
