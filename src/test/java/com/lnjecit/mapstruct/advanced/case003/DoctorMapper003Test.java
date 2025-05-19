package com.lnjecit.mapstruct.advanced.case003;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoctorMapper003Test {

    @Autowired
    private DoctorMapper003 doctorMapper003;

    @Test
    public void test() {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("张三");
        doctor.setSpecialty("Information Not Available");
        doctor.setPatientList(patientList());

        DoctorDto doctorDto = doctorMapper003.doctorToDoctorDto(doctor);
        System.out.println(doctorDto);
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
