package com.example.testdemo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {

    private static final long serialVersionUID = 3644393319870154475L;

    private String id;

    private String name;

    private String idCard;

    private String mobile;

    private String stateCode;

}
