package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class FareService {

    public int getFare(int hours){
        return hours*40;
    }
}
