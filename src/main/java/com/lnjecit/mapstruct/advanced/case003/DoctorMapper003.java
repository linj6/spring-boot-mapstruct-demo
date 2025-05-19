package com.lnjecit.mapstruct.advanced.case003;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * 表达式
 */
@Mapper(uses = {PatientMapper003.class}, componentModel = "spring")
public interface DoctorMapper003 {

    @Mapping(target = "externalId", expression = "java(java.util.UUID.randomUUID().toString())")
    @Mapping(source = "doctor.availability", target = "availability", defaultExpression = "java(java.time.LocalDateTime.now())")
    @Mapping(source = "doctor.patientList", target = "patientDtoList")
    @Mapping(source = "doctor.specialty", target = "specialization")
    DoctorDto doctorToDoctorDto(Doctor doctor);

}
