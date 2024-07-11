package com.example.testdemo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class InfoAddParams implements Serializable {

    private static final long serialVersionUID = 3762810837363650335L;

    private String addressUrl;

    private String name;

    private String imgPic;

}
