package com.example.datacollected.services.impl;

import com.example.datacollected.domain.exceptions.CollectedDataNotFound;
import com.example.datacollected.domain.models.CollectedData;
import com.example.datacollected.domain.models.CollectedDataId;
import com.example.datacollected.domain.repository.CollectedDataRepository;
import com.example.datacollected.services.CollectedDataService;
import com.example.datacollected.services.form.CollectedDataForm;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CollectedDataServiceImpl implements CollectedDataService {

    private final CollectedDataRepository collectedDataRepository;
    @Override
    public CollectedData findById(CollectedDataId id) {
        return this.collectedDataRepository.findById(id).orElseThrow(CollectedDataNotFound::new);
    }

    @Override
    public CollectedData createDataSet(CollectedDataForm form) {
        CollectedData p = CollectedData.build(form.getCollectedDataName(),form.getDataType());
        collectedDataRepository.save(p);
        return p;
    }

    @Override
    public CollectedData addedDataToSet(CollectedDataId dataId, int quantity) {
        return null;
    }

    @Override
    public CollectedData removedDataFromSet(CollectedDataId dataId, int quantity) {
        return null;
    }

    @Override
    public List<CollectedData> getAll() {
        return this.collectedDataRepository.findAll();
    }
}
