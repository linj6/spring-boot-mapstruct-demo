package com.lnjecit.mapstruct.advanced.case002;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * 设置常量和默认值
 */
@Mapper(uses = {PatientMapper002.class}, componentModel = "spring")
public interface DoctorMapper002 {

    @Mapping(target = "id", constant = "-1")
    @Mapping(source = "doctor.patientList", target = "patientDtoList")
    @Mapping(source = "doctor.specialty", target = "specialization", defaultValue = "Information Not Available")
    DoctorDto doctorToDoctorDto(Doctor doctor);

}
