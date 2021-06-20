package com.yu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;//0:女  1：男
    private Date brith;
    private Deppartment deppartment;

    public Employee(Integer id, String lastName, String email, Integer gender, Deppartment deppartment) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.brith = new Date();
        this.deppartment = deppartment;
    }
}
