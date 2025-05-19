package com.lnjecit.mapstruct.datatypeconvert.case006;

import java.util.Map;
import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Map集合映射
 */
@Mapper
public interface DoctorMapper {

    DoctorMapper INSTANCE = Mappers.getMapper(DoctorMapper.class);

    Map<String, DoctorDto> doctorMapToDoctorDtoMap(Map<String, Doctor> doctorMap);

}
