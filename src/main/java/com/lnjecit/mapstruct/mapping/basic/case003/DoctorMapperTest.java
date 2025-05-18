package com.lnjecit.mapstruct.mapping.basic.case003;

public class DoctorMapperTest {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("jack");
        doctor.setSpecialty("Doctor.specialty映射到DoctorDto.specialization");

        Education education = new Education();
        education.setDegreeName("Education.degreeName映射到DoctorDto.degree");

        DoctorMapper doctorMapper = DoctorMapper.INSTANCE;
        DoctorDto doctorDto = doctorMapper.doctorToDoctorDto(doctor, education);
        System.out.println(doctorDto);
    }

}
