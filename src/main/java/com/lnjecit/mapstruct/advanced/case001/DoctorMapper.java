package com.lnjecit.mapstruct.advanced.case001;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 利用spring的依赖注入，创建DoctorMapper实例
 */
@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorDto doctorToDoctorDto(Doctor doctor);

}
