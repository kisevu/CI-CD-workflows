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

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class OrderId implements Serializable {
    private String username;
    private LocalDateTime orderTime;
}
