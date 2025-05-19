package com.lnjecit.mapstruct.advanced.case003;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DoctorDto {

    private int id;
    private String name;
    private String specialization;
    private List<PatientDto> patientDtoList;
    private String externalId;
    private LocalDateTime availability;
}

