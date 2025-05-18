package com.lnjecit.mapstruct.mapping.basic.case004;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapper {

    PatientMapper  INSTANCE = Mappers.getMapper(PatientMapper.class);

    PatientDto patientToPatientDto(Patient patient);

}
