package com.example.sharedkernel.domain.events.aimodels;

import com.example.sharedkernel.domain.config.TopicHolder;
import com.example.sharedkernel.domain.events.DomainEvent;

public class AiModelTrained extends DomainEvent {

    private String modelId;
    private String data;

    public AiModelTrained(String topic) {
        super(TopicHolder.TOPIC_AI_MODEL_TRAINED);
    }

    public AiModelTrained(String modelId, String data) {
        super(TopicHolder.TOPIC_AI_MODEL_TRAINED);
        this.modelId = modelId;
        this.data = data;
    }
}
