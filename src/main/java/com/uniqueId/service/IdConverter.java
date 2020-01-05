package com.uniqueId.service;


import com.uniqueId.dto.Id;
import com.uniqueId.dto.IdMeta;

public interface IdConverter {

    long convert(Id id, IdMeta idMeta);

    Id convert(long id, IdMeta idMeta);

}
