package com.lnjecit.mapstruct.advanced.case006;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoctorCustomerMapper006Test {

    @Autowired
    private DoctorCustomerMapper006 doctorCustomerMapper006;

    @Test
    public void test() {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("Dr. John");
        doctor.setSpecialty("Cardiology");

        Education education = new Education();
        education.setDegreeName("MD");
        education.setInstitute("Stanford University");
        education.setYearOfPassing(2010);

        DoctorDto doctorDto = doctorCustomerMapper006.toDoctorDto(doctor, education);
        System.out.println(doctorDto);
    }
}
