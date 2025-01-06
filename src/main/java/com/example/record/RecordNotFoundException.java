package com.example.record;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Record with this id does not exist")
public class RecordNotFoundException extends Exception {

}
