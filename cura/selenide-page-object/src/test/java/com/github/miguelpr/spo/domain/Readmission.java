package com.github.miguelpr.spo.domain;

public enum Readmission {
    YES(true),
    NO(false);

    private Boolean readmission;

    Readmission(Boolean readmission) {
        this.readmission = readmission;
    }

    public Boolean getValue() {
        return readmission;
    }
}
