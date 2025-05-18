package com.lnjecit.mapstruct.mapping.basic.case005;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapper {

    PatientMapper  INSTANCE = Mappers.getMapper(PatientMapper.class);

    PatientDto patientToPatientDto(Patient patient);

//    Patient patientDtoToPatient(PatientDto patientDto);

}
