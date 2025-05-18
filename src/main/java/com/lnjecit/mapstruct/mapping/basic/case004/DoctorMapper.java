package com.lnjecit.mapstruct.mapping.basic.case004;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 对象中子对象映射使用案例
 *
 * Doctor.specialty映射到DoctorDto.specialization
 * Education.degreeName映射到DoctorDto.degree
 * Doctor.patientList映射到DoctorDto.patientDtoList
 */
@Mapper(uses = {PatientMapper.class})
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mapping(source = "doctor.patientList", target = "patientDtoList")
    @Mapping(source = "education.degreeName", target = "degree")
    @Mapping(source = "doctor.specialty", target = "specialization")
    DoctorDto doctorToDoctorDto(Doctor doctor, Education education);

}
