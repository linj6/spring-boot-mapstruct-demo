package com.lnjecit.mapstruct.advanced.case006;

import java.util.ArrayList;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * 创建自定义映射器 @BeforeMapping,@AfterMapping 使用案例
 * <p>
 * DoctorDto.specialty映射到Doctor.specialization DoctorDto.patientDtoList映射到Doctor.patientList
 */
@Mapper(uses = {PatientMapper006.class}, componentModel = "spring")
public abstract class DoctorCustomerMapper006 {

    @BeforeMapping
    protected void validate(Doctor doctor) {
        System.out.println("DoctorCustomerMapper006 validate. @BeforeMapping valid");
        if (doctor.getPatientList() == null) {
            doctor.setPatientList(new ArrayList<>());
        }
    }

    @AfterMapping
    protected void updateResult(@MappingTarget DoctorDto doctorDto) {
        System.out.println("DoctorCustomerMapper006 updateResult. @AfterMapping update");
        doctorDto.setName(doctorDto.getName().toUpperCase());
        doctorDto.setDegree(doctorDto.getDegree().toUpperCase());
        doctorDto.setSpecialization(doctorDto.getSpecialization().toUpperCase());
    }

    @Mapping(source = "education.degreeName", target = "degree")
    @Mapping(source = "doctor.patientList", target = "patientDtoList")
    @Mapping(source = "doctor.specialty", target = "specialization")
    public abstract DoctorDto toDoctorDto(Doctor doctor, Education education);

}
