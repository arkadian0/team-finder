package com.teamfinder.game.person.core.ports.outgoing;

import com.teamfinder.game.person.core.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonDatabasePort {
    void save(Person person);

    Optional<Person> getPlayerById(Long playerId);
}
