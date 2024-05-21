package com.example.datacollected.domain.repository;

import com.example.datacollected.domain.models.CollectedData;
import com.example.datacollected.domain.models.CollectedDataId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectedDataRepository extends JpaRepository<CollectedData, CollectedDataId> {
}
