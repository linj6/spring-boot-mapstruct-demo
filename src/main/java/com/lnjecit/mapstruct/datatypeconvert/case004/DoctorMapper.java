package com.lnjecit.mapstruct.datatypeconvert.case004;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * List集合映射
 */
@Mapper
public interface DoctorMapper {

    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    List<DoctorDto> doctorListToDoctorDtoList(List<Doctor> doctorList);

}
