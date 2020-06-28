package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zhangZaiShen
 * @Description //TODO $
 * @Date $ $
 **/
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
