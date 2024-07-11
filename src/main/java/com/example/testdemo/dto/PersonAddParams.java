package com.example.testdemo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonAddParams implements Serializable {

    private static final long serialVersionUID = 3937599188729813989L;

    private String name;

    private String idCard;

    private String mobile;

    private String stateCode;

}
