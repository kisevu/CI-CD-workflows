package com.ameda.kisevu.Githubactions_cicd.specification.specification;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.specification.entity.Person;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class PersonSpecification {

    public static Specification<Person> hasAge(int age){
        return (Root<Person> root,
        CriteriaQuery<?> query,
        CriteriaBuilder builder) ->{
            if(age <0){
                return null;
            }
            return builder.equal(root.get("age"),age);
        };
    }

    public static Specification<Person> nameLike(String name){
        return (Root<Person> root,
                CriteriaQuery<?> query,
                CriteriaBuilder builder) ->{
            if(name==null){
                return null;
            }
            return builder.like(root.get("name"),"%"+name+"%");
        };
    }
}
