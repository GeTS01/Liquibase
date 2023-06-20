package com.example.Liqibase.repository.impl;

import com.example.Liqibase.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;

import static lombok.AccessLevel.PRIVATE;

@Repository
@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class GenreRepositoryImpl implements GenreRepository {
}
