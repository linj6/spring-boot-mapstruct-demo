package com.lnjecit.mapstruct.datatypeconvert.case005;

import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Set集合映射
 */
@Mapper
public interface DoctorMapper {

    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    Set<DoctorDto> doctorSetToDoctorDtoSet(Set<Doctor> doctorSet);

}
