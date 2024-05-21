package com.example.aimodelmanage.service;

import com.example.aimodelmanage.domain.model.AiModel;
import com.example.aimodelmanage.domain.model.AiModelId;

import java.util.List;
import java.util.Optional;

public interface AiModelService {
    AiModelId trainModel(AiModelId id);
    List<AiModel> findAll();

    Optional<AiModel> findById(AiModelId id);

}
