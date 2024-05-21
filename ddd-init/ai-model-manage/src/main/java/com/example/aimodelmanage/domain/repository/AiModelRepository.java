package com.example.aimodelmanage.domain.repository;

import com.example.aimodelmanage.domain.model.AiModel;
import com.example.aimodelmanage.domain.model.AiModelId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AiModelRepository extends JpaRepository<AiModel, AiModelId> {
}
