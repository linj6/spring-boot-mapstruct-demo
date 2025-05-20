package com.lnjecit.mapstruct.advanced.case005;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DoctorPatientSummary {

    private int doctorId;
    private int patientCount;
    private String doctorName;
    private String specialization;
    private String institute;
    private List<Integer> patientIds;
}

