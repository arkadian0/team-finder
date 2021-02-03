package com.teamfinder.game.person.core.domain;

import com.teamfinder.game.common.enums.Gender;
import com.teamfinder.game.location.Town;
import com.teamfinder.game.person.application.api.command.FillProfileCommand;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email(message = "validation.email.syntax")
    @Column(name = "EMAIL", nullable = false,unique = true, length = 255)
    private String email;

    @Column(name = "FIRST_NAME", nullable = false, length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 50)
    private String lastName;

    @Column(name = "DESCRIPTION", length = 255)
    private String description;

    @Column(name = "AGE", nullable = false)
    private Short age;

    @Column(name = "GENDER", nullable = false, length = 5)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TOWN_ID",nullable = false)
    private Town town;

    public Person() {};

    public Person(String email, String
            firstName, String lastName, Gender gender, String description, Short age) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.description = description;
        this.age = age;
    }

    public static Person of(FillProfileCommand command) {
        return new Person(command.getEmail(),command.getFirstName(),command.getLastName(),command.getGender(),command.getDescription(),command.getAge());
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public Short getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
