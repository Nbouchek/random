package com.example.randomizer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
class RandomNumberGeneratorController {
    private RandomNumberGeneratorRepository repository;

    public RandomNumberGeneratorController(RandomNumberGeneratorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/random")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<RandomNumberGenerator> randomNumbers() {
        repository.deleteAll();

        Stream.of(Double.toString((new Random(System.nanoTime())).nextDouble()))
                .forEach(value -> {
                    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
                    (randomNumberGenerator).setValue(value);
                    repository.save(randomNumberGenerator);
                });

        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
