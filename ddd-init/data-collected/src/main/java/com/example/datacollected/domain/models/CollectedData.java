package com.example.datacollected.domain.models;

import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.data.DataType;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="product")
@Getter
public class CollectedData extends AbstractEntity<CollectedDataId> {

    private String collectedDataName;

    @AttributeOverrides({
            @AttributeOverride(name="type", column = @Column(name="data_type")),
    })
    private DataType dataType;

    private CollectedData() {
        super(CollectedDataId.randomId(CollectedDataId.class));
    }

    public static CollectedData build(String collectedDataName, DataType dataType) {
        CollectedData p = new CollectedData();
        p.dataType = dataType;
        p.collectedDataName = collectedDataName;
        return p;
    }
}


