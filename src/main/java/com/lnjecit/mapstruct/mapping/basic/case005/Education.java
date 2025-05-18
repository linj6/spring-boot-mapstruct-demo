package com.lnjecit.mapstruct.mapping.basic.case005;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Education {
    private String degreeName;
    private String institute;
    private Integer yearOfPassing;
}
