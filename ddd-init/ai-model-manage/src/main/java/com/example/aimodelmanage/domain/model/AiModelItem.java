package com.example.aimodelmanage.domain.model;

import com.example.datacollected.domain.models.CollectedDataId;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.base.DomainObjectId;
import com.example.sharedkernel.domain.data.DataType;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;

@Entity
@Table(name = "ai_model_item")
@Getter
public class AiModelItem extends AbstractEntity<AiModelItemId> {

    @Column(name = "data_type", nullable = false)
    private DataType data;

    @AttributeOverride(name = "id", column = @Column(name = "model_id", nullable = false))
    private AiModelItemId aiModelId;

    public AiModelItem() {
        super(DomainObjectId.randomId(AiModelItemId.class));
    }

    public AiModelItem(@NonNull AiModelItemId aiModelId, @NonNull DataType dataType) {
        super(DomainObjectId.randomId(AiModelItemId.class));
        this.aiModelId = aiModelId;
        this.data = dataType;
    }
}


