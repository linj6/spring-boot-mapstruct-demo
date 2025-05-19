package com.lnjecit.mapstruct.datatypeconvert.case005;

import java.util.HashSet;
import java.util.Set;

public class DoctorMapperTest {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");
        doctor.setSpecialization("外科");

        Set<Doctor> doctorSet = new HashSet<>();
        doctorSet.add(doctor);

        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        Set<DoctorDto> doctorDtoSet = doctorMapper.doctorSetToDoctorDtoSet(doctorSet);
        System.out.println(doctorDtoSet);
    }

}
