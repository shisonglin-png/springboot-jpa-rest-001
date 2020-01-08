package com.offcn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
//符合jpa规范的和数据库的表对应的实体类
@Entity
//可以自定义表名
@Table(name = "tb_user")
public class User {
    //主键字段、
    @Id
    //主键设置自增
    @GeneratedValue
    private Long uid;
    //普通字段设置字段名，是否非空，及数量大小
    @Column(name = "username",nullable = false ,length = 100)
    private String username;
    @Column(name = "age",nullable = false,length = 50)
    private Integer age;
}
