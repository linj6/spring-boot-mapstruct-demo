package com.lnjecit.mapstruct.datatypeconvert.case002;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 数字类型格式转换使用案例
 */
@Mapper
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);


    @Mapping(source = "costPrice", target = "costPrice", numberFormat = "#.00")
    @Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "yyyy-MM-dd")
    Patient patientDtoToPatient(PatientDto patientDto);

}
