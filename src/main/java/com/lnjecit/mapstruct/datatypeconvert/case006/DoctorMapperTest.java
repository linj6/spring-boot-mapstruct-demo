package com.lnjecit.mapstruct.datatypeconvert.case006;

import java.util.HashMap;
import java.util.Map;

public class DoctorMapperTest {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");
        doctor.setSpecialization("外科");

        Map<String, Doctor> doctorMap = new HashMap<>();
        doctorMap.put(doctor.getName(), doctor);

        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        Map<String, DoctorDto> doctorDtoMap = doctorMapper.doctorMapToDoctorDtoMap(doctorMap);
        System.out.println(doctorDtoMap);
    }

}
