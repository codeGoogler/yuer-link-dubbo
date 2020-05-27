package com.yuer.dubbo.provider.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserModel implements Serializable {
    private String name;
    private int age;
    private int level;
    private int userId;
}
