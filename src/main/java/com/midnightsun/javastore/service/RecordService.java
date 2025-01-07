package com.midnightsun.javastore.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.midnightsun.javastore.exception.RecordNotFoundException;
import com.midnightsun.javastore.model.Record;
import com.midnightsun.javastore.repository.RecordRepository;

@Service
public class RecordService {
    private RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public Record createRecord(String message) {
        return recordRepository.save(new Record(message));
    };

    public Record readRecord(Long id) throws RecordNotFoundException {
        Optional<Record> recordOptional = recordRepository.findById(id);
        if (recordOptional.isEmpty())
            throw new RecordNotFoundException();
        return recordOptional.get();
    }

    public Record updateRecord(Long id, String message) throws RecordNotFoundException {
        Optional<Record> recordOptional = recordRepository.findById(id);
        if (recordOptional.isEmpty())
            throw new RecordNotFoundException();
        Record record = recordOptional.get();
        record.setMessage(message);
        recordRepository.save(record);
        return record;
    }

    public void deleteRecord(Long id) {
        recordRepository.deleteById(id);
    }
}
