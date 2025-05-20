package com.lnjecit.mapstruct.advanced.case005;

import java.util.stream.Collectors;
import org.mapstruct.Mapper;

/**
 * 创建自定义映射器使用案例
 * <p>
 * DoctorDto.specialty映射到Doctor.specialization DoctorDto.patientDtoList映射到Doctor.patientList
 */
@Mapper(uses = {PatientMapper005.class}, componentModel = "spring")
public abstract class DoctorCustomerMapper {

    public DoctorPatientSummary toDoctorPatientSummary(
        Doctor doctor, Education education) {

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
