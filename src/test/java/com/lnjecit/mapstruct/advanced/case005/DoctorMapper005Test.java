package com.lnjecit.mapstruct.advanced.case005;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoctorMapper005Test {

    @Autowired
    private DoctorCustomerMapper doctorMapper004;

    @Test
    public void test() {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("Dr. Smith");
        doctor.setSpecialty("Cardiology");
        doctor.setPatientList(patientList());

        Education education = new Education();
        education.setDegreeName("MD");
        education.setInstitute("Harvard Medical School");
        education.setYearOfPassing(2015);

        DoctorPatientSummary doctorPatientSummary = doctorMapper004.toDoctorPatientSummary(doctor, education);
        System.out.println(doctorPatientSummary);
    }

    private List<Patient> patientList() {
        List<Patient> patientList = new ArrayList<>();
        Patient patient = new Patient();
        patient.setId(101);
        patient.setName("patient.name映射到PatientDto.name");
        patientList.add(patient);
        return patientList;
    }
}
