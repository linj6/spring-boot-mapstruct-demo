package com.lnjecit.mapstruct.mapping.basic.case003;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DoctorDto {
    private int id;
    private String name;
    private String degree;
    private String specialization;
}

