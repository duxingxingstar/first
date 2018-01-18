package com.dxx.boot;

import com.dxx.boot.dao.UserDao;
import com.dxx.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyBoot implements CommandLineRunner{

    @Autowired
    private UserDao userRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyBoot.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        try {
            User user = new User();


            user.setName("张三");
            user.setAge(20);
            userRepository.save(user);
            User u = userRepository.findByName("张三");
            System.out.println("id:"+u.getId()+",name:"+u.getName()+",age:"+u.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
