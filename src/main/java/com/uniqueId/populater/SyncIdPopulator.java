package com.uniqueId.populater;

import com.uniqueId.dto.Id;
import com.uniqueId.dto.IdMeta;
import com.uniqueId.service.Timer;

public class SyncIdPopulator extends BasePopulator {

    public SyncIdPopulator() {
        super();
    }

    public synchronized void populateId(Timer timer, Id id, IdMeta idMeta) {
        super.populateId(timer, id, idMeta);
    }

}
