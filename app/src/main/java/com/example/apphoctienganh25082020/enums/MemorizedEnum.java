package com.example.apphoctienganh25082020.enums;

public enum MemorizedEnum {
    MEMORIZED(1) , FORGOT(0);

    private final int value;

    private MemorizedEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
