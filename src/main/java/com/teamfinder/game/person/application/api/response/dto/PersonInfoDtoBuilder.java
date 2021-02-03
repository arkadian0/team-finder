package com.teamfinder.game.person.application.api.response.dto;

import com.teamfinder.game.common.enums.Gender;

public final class PersonInfoDtoBuilder {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String description;
    private Short age;
    private Gender gender;

    private PersonInfoDtoBuilder() {
    }

    public static PersonInfoDtoBuilder builder() {
        return new PersonInfoDtoBuilder();
    }

    public PersonInfoDtoBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public PersonInfoDtoBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonInfoDtoBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonInfoDtoBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonInfoDtoBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public PersonInfoDtoBuilder setAge(Short age) {
        this.age = age;
        return this;
    }

    public PersonInfoDtoBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public PersonInfoDto build() {
        PersonInfoDto personInfoDto = new PersonInfoDto();
        personInfoDto.setId(id);
        personInfoDto.setEmail(email);
        personInfoDto.setFirstName(firstName);
        personInfoDto.setLastName(lastName);
        personInfoDto.setDescription(description);
        personInfoDto.setAge(age);
        personInfoDto.setGender(gender);
        return personInfoDto;
    }
}
