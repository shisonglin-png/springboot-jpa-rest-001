package com.offcn.dao;

import com.offcn.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "api")
public interface UserDao  extends JpaRepository<User,Long> {
    //自定义查询
    @Query("select u from User u where u.username=:username and u.age=:age")
    @RestResource(path = "/login")
    public User login(@Param("username") String username, @Param("age") Integer age);
}
