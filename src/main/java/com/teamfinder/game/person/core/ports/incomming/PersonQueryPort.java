package com.teamfinder.game.person.core.ports.incomming;

import com.teamfinder.game.common.response.TfResult;
import com.teamfinder.game.person.application.api.response.dto.PersonInfoDto;

public interface PersonQueryPort {
    PersonInfoDto getPlayerInfoById(Long playerId);
}
