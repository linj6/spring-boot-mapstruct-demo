package com.lnjecit.mapstruct.datatypeconvert.case001;

import java.time.LocalDate;
import org.mapstruct.factory.Mappers;

public class PatientMapperTest {

    public static void main(String[] args) {
        PatientDto patientDto = new PatientDto();
        patientDto.setId(1);
        patientDto.setName("张三");
        patientDto.setDateOfBirth(LocalDate.of(1990, 1, 1));

        PatientMapper patientMapper = Mappers.getMapper(PatientMapper.class);
        Patient patient = patientMapper.patientDtoToPatient(patientDto);
        System.out.println(patient);
    }
}
