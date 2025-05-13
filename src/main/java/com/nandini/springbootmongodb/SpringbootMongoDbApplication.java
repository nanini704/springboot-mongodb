package com.nandini.springbootmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
class SpringbootMongoDbApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMongoDbApplication.class, args);
    }

}
