package com.lnjecit.mapstruct.mapping.basic.case005;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * 使用对象中的值更新现有实例使用案例
 *
 * DoctorDto.specialty映射到Doctor.specialization
 * DoctorDto.patientDtoList映射到Doctor.patientList
 */
@Mapper(uses = {PatientMapper.class})
public interface DoctorMapper {
    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    @Mapping(source = "doctorDto.patientDtoList", target = "patientList")
    @Mapping(source = "doctorDto.specialization", target = "specialty")
    void updateDoctor(DoctorDto doctorDto, @MappingTarget Doctor doctor);

}
