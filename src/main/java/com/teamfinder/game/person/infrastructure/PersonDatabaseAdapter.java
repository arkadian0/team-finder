package com.teamfinder.game.person.infrastructure;

import com.teamfinder.game.person.core.domain.Person;
import com.teamfinder.game.person.core.ports.outgoing.PersonDatabasePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class PersonDatabaseAdapter implements PersonDatabasePort {

    private final PersonRepository personRepository;

    @Autowired
    public PersonDatabaseAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public Optional<Person> getPlayerById(Long playerId) {
        return personRepository.findById(playerId);
    }


}
