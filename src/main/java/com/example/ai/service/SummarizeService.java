package com.example.ai.service;

import org.springframework.stereotype.Service;

import com.example.ai.dto.SummarizeResponse;

@Service
public class SummarizeService {

    public SummarizeResponse summarize(String text) {
        return new SummarizeResponse(text);
    }
}