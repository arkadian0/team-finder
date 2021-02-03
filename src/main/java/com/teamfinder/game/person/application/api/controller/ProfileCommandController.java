package com.teamfinder.game.person.application.api.controller;

import com.teamfinder.game.person.application.api.command.FillProfileCommand;
import com.teamfinder.game.person.core.ports.incomming.PersonCommandPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/profile")
class ProfileCommandController {

    private final PersonCommandPort personCommandPort;

    @Autowired
    public ProfileCommandController(PersonCommandPort personCommandPort) {
        this.personCommandPort = personCommandPort;
    }

    @PostMapping(value = "/fill")
    public ResponseEntity fillProfile(@RequestBody FillProfileCommand command) {
        personCommandPort.fillProfile(command);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Profile was created");
    }


}
