package com.example.dummygenerator.dto;

import lombok.Data;

public class DummyDto {
    @Data
    public static class PayMethodRequestDto {
        private String payMethodId;
        private String payMethodCode;
        private String payMethodName;
    }
}
