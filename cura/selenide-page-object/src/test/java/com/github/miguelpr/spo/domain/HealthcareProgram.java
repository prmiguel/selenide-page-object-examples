package com.github.miguelpr.spo.domain;

public enum HealthcareProgram {
    MEDICARE("Medicare"),
    MEDICAID("Medicaid"),
    NONE("None");

    private String program;

    HealthcareProgram(String program) {
        this.program = program;
    }

    public String getValue() {
        return program;
    }
}
