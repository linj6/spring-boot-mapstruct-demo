package com.lnjecit.mapstruct.datatypeconvert.case001;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Patient {
    private int id;
    private String name;
    private String dateOfBirth;
}

