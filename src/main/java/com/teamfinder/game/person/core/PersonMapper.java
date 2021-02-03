package com.teamfinder.game.person.core;

import com.teamfinder.game.person.application.api.response.dto.PersonInfoDto;
import com.teamfinder.game.person.application.api.response.dto.PersonInfoDtoBuilder;
import com.teamfinder.game.person.core.domain.Person;

class PersonMapper {

    private PersonMapper() {};

    public static PersonInfoDto map(Person person) {
        return PersonInfoDtoBuilder.builder()
                .setAge(person.getAge())
                .setDescription(person.getDescription())
                .setEmail(person.getEmail())
                .setFirstName(person.getFirstName())
                .setGender(person.getGender())
                .setId(person.getId())
                .setLastName(person.getLastName()).build();
    }
}
