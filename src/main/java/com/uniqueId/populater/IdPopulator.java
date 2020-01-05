package com.uniqueId.populater;

import com.uniqueId.dto.Id;
import com.uniqueId.dto.IdMeta;
import com.uniqueId.service.Timer;

public interface IdPopulator {

    void populateId(Timer timer, Id id, IdMeta idMeta);

}
