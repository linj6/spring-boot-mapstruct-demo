package com.lnjecit.mapstruct.datatypeconvert.case001;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PatientDto {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
}

