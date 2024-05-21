package com.example.aimodelmanage.domain.valueobjects;

import com.example.aimodelmanage.domain.model.AiModelId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WeatherCondition {
    private AiModelId id;
    private String weatherDescription;
    private int temperature;

    private void WeatherCondition() {
        this.id=AiModelId.randomId(AiModelId.class);
        this.weatherDescription ="";
        this.temperature=0;
    }

    @JsonCreator
    public void FlightPath(@JsonProperty("id") AiModelId id,
                           @JsonProperty("weatherDescription") String weatherDescription,
                           @JsonProperty("temperature") int temperature) {
        this.id = id;
        this.weatherDescription = weatherDescription;
        this.temperature = temperature;
    }
}
