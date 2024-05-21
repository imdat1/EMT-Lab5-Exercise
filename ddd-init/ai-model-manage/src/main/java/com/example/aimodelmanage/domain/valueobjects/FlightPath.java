package com.example.aimodelmanage.domain.valueobjects;

import com.example.aimodelmanage.domain.model.AiModelId;
import com.example.sharedkernel.domain.data.DataType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class FlightPath {
    private AiModelId id;
    public String flyingTo;
    public String flyingFrom;
    private void FlightPath() {
        this.id=AiModelId.randomId(AiModelId.class);
        this.flyingTo ="";
        this.flyingFrom = "";
    }

    @JsonCreator
    public void FlightPath(@JsonProperty("id") AiModelId id,
                         @JsonProperty("flyingTo") String flyingTo,
                         @JsonProperty("flyingFrom") String flyingFrom) {
        this.id = id;
        this.flyingTo = flyingTo;
        this.flyingFrom = flyingFrom;
    }
}
