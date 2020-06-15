package com.github.miguelpr.spo.pages;

import com.github.miguelpr.spo.domain.Facility;
import com.github.miguelpr.spo.domain.HealthcareProgram;
import com.github.miguelpr.spo.domain.Readmission;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AppointmentSummaryPage {

    public AppointmentSummaryPage shouldHaveTheFacility(Facility facility) {
        $("#facility").shouldHave(text(facility.getValue()));
        return this;
    }

    public AppointmentSummaryPage shouldHaveTheApplyForHospitalReadmission(Readmission readmission) {
        String readmissionDisplayed = readmission.getValue() ? "Yes" : "No";
        $("#hospital_readmission").shouldHave(text(readmissionDisplayed));
        return this;
    }

    public AppointmentSummaryPage shouldHaveTheHealthcareProgram(HealthcareProgram program) {
        $("#program").shouldHave(text(program.getValue()));
        return this;
    }

    public AppointmentSummaryPage shouldHaveTheVisitDate(String visitDate) {
        $("#visit_date").shouldHave(text(visitDate));
        return this;
    }

    public AppointmentSummaryPage shouldHaveTheComment(String comment) {
        $("#comment").shouldHave(text(comment));
        return this;
    }
}
