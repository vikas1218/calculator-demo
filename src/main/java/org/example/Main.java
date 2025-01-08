package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main
{

        public static void main(String[] args)
        {
            SpringApplication.run(Main.class, args);
        }


        @Bean
        CommandLineRunner run(Calculator calculator)
        {
            return args -> {
                System.out.println("Addition: " + calculator.add(10, 5));
                System.out.println("Subtraction: " + calculator.subtract(10, 5));
                System.out.println("Multiplication: " + calculator.multiply(10, 5));
                System.out.println("Division: " + calculator.divide(10, 5));
            };
        }

}
