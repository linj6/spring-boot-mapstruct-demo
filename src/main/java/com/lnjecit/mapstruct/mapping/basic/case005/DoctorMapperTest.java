package com.lnjecit.mapstruct.mapping.basic.case005;

import java.util.ArrayList;
import java.util.List;

public class DoctorMapperTest {

    public static void main(String[] args) {
        DoctorDto doctorDto = new DoctorDto();
        doctorDto.setId(1);
        doctorDto.setName("doctorDto.name映射到Doctor.name");
        doctorDto.setSpecialization("DoctorDto.specialization映射到doctor.specialty");
        doctorDto.setPatientDtoList(patientDtoList());

        Doctor doctor = new Doctor();
        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        doctorMapper.updateDoctor(doctorDto, doctor);
        System.out.println(doctorDto);
        System.out.println(doctor);
    }

    private static List<PatientDto> patientDtoList() {
        List<PatientDto> patientList = new ArrayList<>();
        PatientDto patientDto = new PatientDto();
        patientDto.setId(101);
        patientDto.setName("PatientDto.name映射到patient.name");
        patientList.add(patientDto);
        return patientList;
    }

}
