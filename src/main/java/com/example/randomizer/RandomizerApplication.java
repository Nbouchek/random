package com.example.randomizer;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class RandomizerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomizerApplication.class, args);
    }

    @Bean
    ApplicationRunner init(RandomNumberGeneratorRepository repository) {
//        return args -> {
//            Random rand = new Random(System.nanoTime());
//            Stream.of(Double.toString(rand.nextDouble()), Double.toString(rand.nextDouble()))
//                    .forEach(value -> {
//                        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
//                        randomNumberGenerator.setValue(value);
//                        repository.save(randomNumberGenerator);
//                    });
//            repository.findAll().forEach(System.out::println);
//        };
        return null;
    }
}
