package com.example.randomizer;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class RandomNumberGenerator {
    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String value;
}
