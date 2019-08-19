package com.example.randomizer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomNumberGeneratorRepository extends JpaRepository<RandomNumberGenerator, Long> {
}
