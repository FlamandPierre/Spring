package com.spring.henallux.firstSpringProject.service;

import org.springframework.stereotype.Service;

@Service
public class GiftService {

    public GiftService(){}

    public String chooseGift(String hobby, Integer age) {
        if (age < 5) return "a puzzle about " + hobby;
        if (age < 10) return "a DVD about " + hobby;
        return "a book about " + hobby;
    }
}
