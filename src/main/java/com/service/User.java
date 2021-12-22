package com.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

@EntityScan
public class User implements Serializable {
    private String uuid;
    private int phone_number;
    private String user_name;

}
