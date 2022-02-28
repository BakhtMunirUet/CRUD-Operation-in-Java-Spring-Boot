package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
            Student bmk = new Student(
                        "Bakht",
                        "bakhtmunirdcse@gmail.com",
                        LocalDate.of(1994, Month.JANUARY, 1)
            );
            Student khan = new Student(
                    "khan",
                    "khan@gmail.com",
                    LocalDate.of(1995, Month.MAY, 1)
            );
            studentRepository.saveAll(List.of(bmk, khan));
        };
    }
}
