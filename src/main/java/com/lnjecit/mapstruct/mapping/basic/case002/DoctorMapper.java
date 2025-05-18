package com.lnjecit.mapstruct.mapping.basic.case002;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 不同字段之间映射使用案例
 * Doctor.specialty映射到Doctor.specialization
 */
@Mapper
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mapping(source = "specialty", target = "specialization")
    DoctorDto doctorToDoctorDto(Doctor doctor);

}
