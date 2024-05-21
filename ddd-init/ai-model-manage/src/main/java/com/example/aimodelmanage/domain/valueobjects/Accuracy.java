package com.example.aimodelmanage.domain.valueobjects;

import com.example.aimodelmanage.domain.model.AiModelId;
import com.example.sharedkernel.domain.base.ValueObject;
import com.example.sharedkernel.domain.data.DataType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Accuracy extends ValueObject {
    private AiModelId id;
    private String name;
    private DataType dataType;
    private double accuracy;

    private void Accuracy() {
        this.id=AiModelId.randomId(AiModelId.class);
        this.name= "";
        this.dataType = DataType.valueOf(String.valueOf(DataType.CSV));
        this.accuracy=0;
    }

    @JsonCreator
    public void Accuracy(@JsonProperty("id") AiModelId id,
                        @JsonProperty("modelName") String name,
                        @JsonProperty("dataType") DataType dataType,
                        @JsonProperty("accuracy") double accuracy) {
        this.id = id;
        this.name = name;
        this.dataType = dataType;
        this.accuracy = accuracy;
    }

}
