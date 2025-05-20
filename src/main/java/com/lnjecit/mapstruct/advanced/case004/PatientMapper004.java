package com.lnjecit.mapstruct.advanced.case004;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper004 {

    PatientDto patientToPatientDto(Patient patient);

}
