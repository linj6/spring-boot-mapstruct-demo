package com.lnjecit.mapstruct.mapping.basic.case001;

public class DoctorMapperTest {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");

        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        DoctorDto doctorDto = doctorMapper.doctorToDoctorDto(doctor);
        System.out.println(doctorDto);
    }

}
