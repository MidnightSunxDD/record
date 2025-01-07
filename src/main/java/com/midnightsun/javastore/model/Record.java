package com.midnightsun.javastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RECORDS")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String message;

    public Record(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    public Record(String message) {
        this.message = message;
    }

    public Record() {
    };

    public String toString() {
        return "Record [id=" + id + ", message=" + message + "]";
    }
}
