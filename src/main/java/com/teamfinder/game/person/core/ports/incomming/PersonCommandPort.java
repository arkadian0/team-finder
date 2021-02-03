package com.teamfinder.game.person.core.ports.incomming;

import com.teamfinder.game.person.application.api.command.FillProfileCommand;

public interface PersonCommandPort {
    void fillProfile(FillProfileCommand command);
}
