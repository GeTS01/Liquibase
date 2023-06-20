package com.example.Liqibase.repository.impl;

import com.example.Liqibase.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;

import static lombok.AccessLevel.PRIVATE;

@Repository
@FieldDefaults(level = PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

}
