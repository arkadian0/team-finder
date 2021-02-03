package com.teamfinder.game.person.core;

import com.teamfinder.game.person.application.api.command.FillProfileCommand;
import com.teamfinder.game.person.core.domain.Person;
import com.teamfinder.game.person.core.ports.incomming.PersonCommandPort;
import com.teamfinder.game.person.core.ports.outgoing.PersonDatabasePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class PersonCommandAdapter implements PersonCommandPort {

    private final PersonDatabasePort personDatabasePort;

    @Autowired
    public PersonCommandAdapter(PersonDatabasePort personDatabasePort) {
        this.personDatabasePort = personDatabasePort;
    }

    @Override
    public void fillProfile(FillProfileCommand command) {
        Person person = Person.of(command);
        personDatabasePort.save(person);
    }

}
