package com.teamfinder.game.person.application.api.command;


import com.teamfinder.game.common.enums.Gender;

public class FillProfileCommand {
    private String firstName;
    private String lastName;
    private String email;
    private Short age;
    private Gender gender;
    private String description;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Short getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getDescription() {
        return description;
    }
}
