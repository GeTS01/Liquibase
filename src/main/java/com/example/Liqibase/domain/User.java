package com.example.Liqibase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends PersistentObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(50) CHECK (LENGTH(name) >= 5)")
    String name;

    @Column(name = "surname", nullable = false, columnDefinition = "VARCHAR(50) CHECK (LENGTH(name) >= 5)")
    String surname;

    @Column(name = "age")
    int age;

    @Column(name = "average_rating")
    double averageRating;

    @Column(name = "email", nullable = false, unique = true)
    String email;

    @Column(name = "phone_number", nullable = false, unique = true)
    String phoneNumber;

}
