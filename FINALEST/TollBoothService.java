package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollBoothService {

    private final FareService fs;
    private final checkPaymentStatus cp;
    public TollBoothService(FareService fs,checkPaymentStatus cp ) {
        this.fs = fs;
        this.cp=cp;
    }

}
