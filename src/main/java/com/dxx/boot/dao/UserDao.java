package com.dxx.boot.dao;

import com.dxx.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User,Long>{

    User findByName(String name);

    @Query(value = "select id,name,age from my_user where name = ?1",nativeQuery = true)
    User findUser(@Param("name") String name);
}
