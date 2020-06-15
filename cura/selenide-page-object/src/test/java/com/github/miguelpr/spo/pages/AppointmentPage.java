package com.github.miguelpr.spo.pages;

import com.github.miguelpr.spo.domain.Facility;
import com.github.miguelpr.spo.domain.HealthcareProgram;
import com.github.miguelpr.spo.domain.Readmission;

import static com.codeborne.selenide.Selenide.$;

public class AppointmentPage {
    public void makeAppointment(Facility facility, Readmission readmission, HealthcareProgram program, String visitDate, String comment) {
        $("#combo_facility").selectOptionByValue(facility.getValue());
        $("#chk_hospotal_readmission").setSelected(readmission.getValue());
        $("[name='programs']").selectRadio(program.getValue());
        $("#txt_visit_date").setValue(visitDate);
        $("#txt_comment").setValue(comment);
        $("#btn-book-appointment").click();
    }
}
