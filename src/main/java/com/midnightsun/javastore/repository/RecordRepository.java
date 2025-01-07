package com.midnightsun.javastore.repository;

import org.springframework.data.repository.CrudRepository;

import com.midnightsun.javastore.model.Record;

public interface RecordRepository extends CrudRepository<Record, Long> {

}
