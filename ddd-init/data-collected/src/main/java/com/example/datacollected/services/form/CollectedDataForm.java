package com.example.datacollected.services.form;

import com.example.sharedkernel.domain.data.DataType;
import lombok.Data;

@Data
public class CollectedDataForm {

    private String collectedDataName;
    private DataType dataType;
}
