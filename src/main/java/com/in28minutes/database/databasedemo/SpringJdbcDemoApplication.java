package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.repository.PersonJdbcRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class SpringJdbcDemoApplication implements CommandLineRunner {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    private PersonJdbcRepository repository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringJdbcDemoApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("All users -> {}", repository.findAll());
//        logger.info("User id 10001 -> {}", repository.findById(10001));
//        logger.info("Users by location Amsterdam -> {}", repository.findByLocation("Amsterdam"));
//        logger.info("Delete by 10001-> {}", repository.deleteById(10001));
//        repository.insert(new Person(20008, "Bilbo", "Hobbiton", new java.util.Date()));
//        logger.info("All users -> {}", repository.findAll());
//        repository.update(new Person(20008, "Bilbo", "Rivendell", new java.util.Date()));
//        logger.info("All users -> {}", repository.findAll());
//    }
//}
