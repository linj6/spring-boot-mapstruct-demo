package com.lnjecit.mapstruct.advanced.case005;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper005 {

    PatientDto patientToPatientDto(Patient patient);

}
