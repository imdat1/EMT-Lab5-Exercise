package com.example.aimodelmanage.domain.model;

import com.example.sharedkernel.domain.base.DomainObjectId;

public class AiModelItemId extends DomainObjectId {
    private AiModelItemId() {
        super(AiModelItemId.randomId(AiModelId.class).getId());
    }

    public AiModelItemId(String uuid) {
        super(uuid);
    }

}
