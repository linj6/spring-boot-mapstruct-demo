package com.lnjecit.mapstruct.mapping.basic.case004;

import java.util.ArrayList;
import java.util.List;

public class DoctorMapperTest {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");
        doctor.setSpecialty("Doctor.specialty映射到DoctorDto.specialization");

        doctor.setPatientList(patientList());

        Education education = new Education();
        education.setDegreeName("Education.degreeName映射到DoctorDto.degree");

        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        DoctorDto doctorDto = doctorMapper.doctorToDoctorDto(doctor, education);
        System.out.println(doctorDto);
    }

    private static List<Patient> patientList() {
        List<Patient> patientList = new ArrayList<>();
        Patient patient = new Patient();
        patient.setId(101);
        patient.setName("patient.name映射到PatientDto.name");
        patientList.add(patient);
        return patientList;
    }

}
