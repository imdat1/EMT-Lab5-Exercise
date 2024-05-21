package com.example.datacollected.domain.models;

import com.example.sharedkernel.domain.base.DomainObjectId;
import lombok.NonNull;

public class CollectedDataId extends DomainObjectId {

    private CollectedDataId() {
        super(CollectedDataId.randomId(CollectedDataId.class).getId());
    }

    public CollectedDataId(@NonNull String uuid) {
        super(uuid);
    }

    public static CollectedDataId of(String uuid) {
        CollectedDataId p = new CollectedDataId(uuid);
        return p;
    }

}
