package com.example.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args){
		SpringApplication.run(DatabaseDemoApplication.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 10001 -> {}" ,repository.findById(10001));
		logger.info("insert id 10004 -> {}" ,repository.insert(new Person("peter","swagger",new Date())));
		logger.info("update id 10002 -> {}" ,repository.update(new Person("sam","mule",new Date())));
		repository.deleteById(10001);
		logger.info("All users> {}" ,repository.findAll());
	}
}
