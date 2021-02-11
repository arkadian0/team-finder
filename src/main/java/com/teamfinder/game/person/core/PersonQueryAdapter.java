package com.teamfinder.game.person.core;

import com.teamfinder.game.common.response.TfResult;
import com.teamfinder.game.person.application.api.response.dto.PersonInfoDto;
import com.teamfinder.game.person.core.domain.Person;
import com.teamfinder.game.person.core.ports.incomming.PersonQueryPort;
import com.teamfinder.game.person.core.ports.outgoing.PersonDatabasePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class PersonQueryAdapter implements PersonQueryPort {

    private final PersonDatabasePort personDatabasePort;

    public PersonQueryAdapter(PersonDatabasePort personDatabasePort) {
        this.personDatabasePort = personDatabasePort;
    }

    @Override
    public PersonInfoDto getPlayerInfoById(Long playerId) {
        Optional<Person> player = personDatabasePort.getPlayerById(playerId);
        if (player.isPresent()) {
            return PersonMapper.map(player.get());
        } else {
            throw new PersonNotFoundException("Użytkownik o Id: " + playerId + " nie istnieje");
        }
    }


}
