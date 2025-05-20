package com.lnjecit.mapstruct.advanced.case005;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DoctorDto {
    private int id;
    private String name;
    private String degree;
    private String specialization;
    private List<PatientDto> patientDtoList;
}

