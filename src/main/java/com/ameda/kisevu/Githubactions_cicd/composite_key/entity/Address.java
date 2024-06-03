package com.ameda.kisevu.Githubactions_cicd.composite_key.entity;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Address {
    private String streetName;
    private String city;
}
