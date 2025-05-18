package com.lnjecit.mapstruct.mapping.basic.case002;

public class DoctorMapperTest {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");
        doctor.setSpecialty("Doctor.specialty映射到Doctor.specialization");

        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        DoctorDto doctorDto = doctorMapper.doctorToDoctorDto(doctor);
        System.out.println(doctorDto);
    }

}
