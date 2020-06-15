package com.github.miguelpr.spo.tests;

import com.codeborne.selenide.junit.TextReport;
import com.github.miguelpr.spo.domain.Facility;
import com.github.miguelpr.spo.domain.HealthcareProgram;
import com.github.miguelpr.spo.domain.Readmission;
import com.github.miguelpr.spo.pages.AppointmentPage;
import com.github.miguelpr.spo.pages.AppointmentSummaryPage;
import com.github.miguelpr.spo.pages.LoginPage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MakeAnAppointment {
    @Rule
    public TextReport report = new TextReport();

    LoginPage loginPage = new LoginPage();
    AppointmentPage appointmentPage = new AppointmentPage();
    AppointmentSummaryPage summary = new AppointmentSummaryPage();

    @Before
    public void loginIntoCURA() {
        loginPage.open()
                .loginWithCredentials("John Doe", "ThisIsNotAPassword");
    }

    @Test
    public void appointmentShouldBeBooked() {
        appointmentPage.makeAppointment(Facility.SEOUL,
                Readmission.YES,
                HealthcareProgram.NONE,
                "24/06/2020",
                "Any related comment about the appointment.");

        summary.shouldHaveTheFacility(Facility.SEOUL)
                .shouldHaveTheApplyForHospitalReadmission(Readmission.YES)
                .shouldHaveTheHealthcareProgram(HealthcareProgram.NONE)
                .shouldHaveTheVisitDate("24/06/2020")
                .shouldHaveTheComment("Any related comment about the appointment.");
    }
}
