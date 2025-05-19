package com.lnjecit.mapstruct.advanced.case002;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoctorMapper002Test {

    @Autowired
    private DoctorMapper002 doctorMapper;

    @Test
    public void test() {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");
//        doctor.setSpecialty("Doctor.specialty映射到DoctorDto.specialization");

        doctor.setPatientList(patientList());

        DoctorDto doctorDto = doctorMapper.doctorToDoctorDto(doctor);
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
