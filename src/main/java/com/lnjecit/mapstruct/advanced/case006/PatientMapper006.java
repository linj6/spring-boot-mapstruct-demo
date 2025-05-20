package com.lnjecit.mapstruct.advanced.case006;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper006 {

    PatientDto patientToPatientDto(Patient patient);

}
