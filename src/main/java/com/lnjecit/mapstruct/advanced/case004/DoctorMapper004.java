package com.lnjecit.mapstruct.advanced.case004;

import java.util.stream.Collectors;
import org.mapstruct.Mapper;

/**
 * 自定义方法实例使用案例
 * <p>
 * DoctorDto.specialty映射到Doctor.specialization DoctorDto.patientDtoList映射到Doctor.patientList
 */
@Mapper(uses = {PatientMapper004.class}, componentModel = "spring")
public interface DoctorMapper004 {

    default DoctorPatientSummary toDoctorPatientSummary(Doctor doctor, Education education) {

        return DoctorPatientSummary.builder()
            .doctorId(doctor.getId())
            .doctorName(doctor.getName())
            .patientCount(doctor.getPatientList().size())
            .patientIds(doctor.getPatientList()
                .stream()
                .map(Patient::getId)
                .collect(Collectors.toList()))
            .institute(education.getInstitute())
            .specialization(education.getDegreeName())
            .build();
    }


}
