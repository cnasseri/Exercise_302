package com.example.demo;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.repository.CrudRepository;

public interface TODORepository extends CrudRepository<BatchProperties.Job, Long> {
}
