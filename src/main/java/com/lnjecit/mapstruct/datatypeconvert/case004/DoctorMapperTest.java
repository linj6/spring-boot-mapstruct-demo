package com.lnjecit.mapstruct.datatypeconvert.case004;

import java.util.ArrayList;
import java.util.List;

public class DoctorMapperTest {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");
        doctor.setSpecialization("外科");

        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(doctor);

        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        List<DoctorDto> doctorDtoList = doctorMapper.doctorListToDoctorDtoList(doctorList);
        System.out.println(doctorDtoList);
    }

}
