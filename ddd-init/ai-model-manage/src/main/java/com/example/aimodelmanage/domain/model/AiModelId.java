package com.example.aimodelmanage.domain.model;

import com.example.sharedkernel.domain.base.DomainObjectId;
import lombok.NonNull;

public class AiModelId extends DomainObjectId {
    private AiModelId() {
        super(AiModelId.randomId(AiModelId.class).getId());
    }

    public AiModelId(@NonNull String uuid) {
        super(uuid);
    }
}
