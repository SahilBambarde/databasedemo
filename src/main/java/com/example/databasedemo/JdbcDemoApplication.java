package com.example.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class JdbcDemoApplication {
    @Autowired
    PersonJdbcDao dao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    public static void main(String[] args) {
//        SpringApplication.run(DatabaseDemoApplication.class, args);
//    }

    public void run(String... args) throws Exception {
        //logger.info("All users -> {}",dao.findAll());
        //logger.info("User id 10001 -> {}",dao.findById(10001));
        //logger.info("Delete User id 10002 -> No of row Deleted {}",dao.deleteById(10002));
        //logger.info("insert 10004 -> {}",dao.insert(new Person(10004,"peter","swagger",new Date())));
        //logger.info("Update 10003 -> {}",dao.update(new Person(10003,"Tara","Berlin",new Date())));
    }
}
