package com.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

@Data
@EntityScan
public class Patient implements Serializable {
    private String patient_id;
    private int patient_contact;
    private String address;
    private String complaint;
}
