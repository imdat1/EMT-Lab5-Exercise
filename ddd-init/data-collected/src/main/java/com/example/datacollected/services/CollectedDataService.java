package com.example.datacollected.services;

import com.example.datacollected.domain.models.CollectedData;
import com.example.datacollected.domain.models.CollectedDataId;
import com.example.datacollected.services.form.CollectedDataForm;

import java.util.List;

public interface CollectedDataService {
    CollectedData findById(CollectedDataId id);
    CollectedData createDataSet(CollectedDataForm form);
    CollectedData addedDataToSet(CollectedDataId dataId, int quantity);
    CollectedData removedDataFromSet(CollectedDataId dataId, int quantity);
    List<CollectedData> getAll();

}
