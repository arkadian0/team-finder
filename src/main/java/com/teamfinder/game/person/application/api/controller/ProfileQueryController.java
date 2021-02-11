package com.teamfinder.game.person.application.api.controller;

import com.teamfinder.game.common.response.TfResult;
import com.teamfinder.game.person.application.api.response.dto.PersonInfoDto;
import com.teamfinder.game.person.core.ports.incomming.PersonQueryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/player")
class ProfileQueryController {

    private final PersonQueryPort personQueryPort;

    @Autowired
    public ProfileQueryController(PersonQueryPort personQueryPort) {
        this.personQueryPort = personQueryPort;
    }

    @GetMapping(value = "/{playerId}")
    public ResponseEntity<TfResult<PersonInfoDto>> getPlayerById(@PathVariable Long playerId) {
        TfResult<PersonInfoDto> result = new TfResult<>(personQueryPort.getPlayerInfoById(playerId));
        return ResponseEntity.ok(result);
    }


}
