package com.example.aimodelmanage.service.impl;

import com.example.aimodelmanage.domain.model.AiModel;
import com.example.aimodelmanage.domain.model.AiModelId;
import com.example.aimodelmanage.domain.repository.AiModelRepository;
import com.example.aimodelmanage.service.AiModelService;
import com.example.sharedkernel.infra.DomainEventPublisher;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.xml.validation.Validator;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class AiModelServiceImpl implements AiModelService {

    private final AiModelRepository aiModelRepository;
    private final DomainEventPublisher domainEventPublisher;

    @Override
    public AiModelId trainModel(AiModelId id) {
        return null;
    }

    @Override
    public List<AiModel> findAll() {
        return this.aiModelRepository.findAll();
    }

    @Override
    public Optional<AiModel> findById(AiModelId id) {
        return this.aiModelRepository.findById(id);
    }
}
