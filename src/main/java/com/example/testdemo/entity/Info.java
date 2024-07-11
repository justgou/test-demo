package com.example.testdemo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Info implements Serializable {

    private static final long serialVersionUID = -759242668049075943L;

    private String id;

    private String addressUrl;

    private String name;

    private String imgPic;

}
