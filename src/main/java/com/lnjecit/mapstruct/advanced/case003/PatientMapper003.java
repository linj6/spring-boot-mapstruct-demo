package com.lnjecit.mapstruct.advanced.case003;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper003 {

    PatientDto patientToPatientDto(Patient patient);

}
