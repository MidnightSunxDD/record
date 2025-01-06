package com.example.record;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/records")
public class RecordController {

    private RecordService recordService;

    RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("create/{message}")
    public String createRecord(@PathVariable String message) {
        Record record = recordService.createRecord(message);
        return record.toString();
    };

    @GetMapping("read/{id}")
    public String readRecord(@PathVariable long id) throws RecordNotFoundException {
        Record record = recordService.readRecord(id);
        return record.toString();
    }

    @GetMapping("/update/{id}/{message}")
    public String updateRecord(@PathVariable long id, @PathVariable String message) throws RecordNotFoundException {
        Record record = recordService.updateRecord(id, message);
        return record.toString();
    }

    @GetMapping("/delete/{id}")
    public String deleteRecord(@PathVariable long id) {
        recordService.deleteRecord(id);
        return "Record with id " + id + " deleted";
    }
}
