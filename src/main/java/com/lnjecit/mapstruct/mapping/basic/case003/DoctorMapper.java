package com.lnjecit.mapstruct.mapping.basic.case003;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * DoctorDto的字段值来自于多个对象使用案例
 * Doctor.specialty映射到DoctorDto.specialization
 * Education.degreeName映射到DoctorDto.degree
 */
@Mapper
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mapping(source = "education.degreeName", target = "degree")
    @Mapping(source = "doctor.specialty", target = "specialization")
    DoctorDto doctorToDoctorDto(Doctor doctor, Education education);

}
