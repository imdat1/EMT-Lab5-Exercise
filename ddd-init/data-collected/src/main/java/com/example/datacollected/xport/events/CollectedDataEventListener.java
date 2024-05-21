package com.example.datacollected.xport.events;

import com.example.datacollected.domain.models.CollectedDataId;
import com.example.datacollected.services.CollectedDataService;
import com.example.sharedkernel.domain.config.TopicHolder;
import com.example.sharedkernel.domain.events.DomainEvent;
import com.example.sharedkernel.domain.events.aimodels.AiModelTrained;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CollectedDataEventListener {

    private final CollectedDataService collectedDataService;
    @KafkaListener(topics= TopicHolder.TOPIC_AI_MODEL_TRAINED, groupId = "productCatalog")
    public void consumeOrderItemCreatedEvent(String jsonMessage) {
        try {
            AiModelTrained event = DomainEvent.fromJson(jsonMessage,AiModelTrained.class);
            collectedDataService.addedDataToSet(CollectedDataId.of(event.getTopic()), 1);
        } catch (Exception e){

        }
    }

}
