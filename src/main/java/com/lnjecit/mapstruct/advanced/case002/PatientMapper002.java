package com.lnjecit.mapstruct.advanced.case002;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper002 {

    PatientDto patientToPatientDto(Patient patient);

}
