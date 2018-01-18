package com.dxx.boot.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "my_user")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name",nullable = false,length = 256,columnDefinition = "varchar(256) COMMENT '会员姓名'")
    private String name;
    @Column(name = "age",nullable = false,length = 3,columnDefinition = "int(3) COMMENT '会员年龄'")
    private int age;
}
