package com.lnjecit.mapstruct.mapping.basic.case001;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 基本映射使用案例 Doctor和DoctorDto字段使用相同名称
 */
@Mapper
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    DoctorDto doctorToDoctorDto(Doctor doctor);

}
