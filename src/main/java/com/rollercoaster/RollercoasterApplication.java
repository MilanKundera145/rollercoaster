package com.rollercoaster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class RollercoasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RollercoasterApplication.class, args);
    }

}
