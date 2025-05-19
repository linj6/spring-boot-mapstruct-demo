package com.lnjecit.mapstruct.advanced.case003;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Doctor {
    private int id;
    private String name;
    private String specialty;
    private List<Patient> patientList;
    private String externalId;
    private LocalDateTime availability;
}

