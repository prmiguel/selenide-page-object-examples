package com.github.miguelpr.spo.domain;

public enum Facility {
    TOKIO("Tokyo CURA Healthcare Center"),
    HONGKONG("Hongkong CURA Healthcare Center"),
    SEOUL("Seoul CURA Healthcare Center");

    private String facility;

    Facility(String facility) {
        this.facility = facility;
    }

    public String getValue() {
        return facility;
    }
}
