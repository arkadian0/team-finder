package com.teamfinder.game.person.core;

class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
