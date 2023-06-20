package com.example.Liqibase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contents")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Content extends PersistentObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)

    private long id;

    @Column(name = "name", length = 200)
    String name;

    @Column(name = "description", length = 1000)
    String description;

    @Column(name = "user_id", nullable = false)
    Long userId;
}
