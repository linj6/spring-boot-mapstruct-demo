package com.lnjecit.mapstruct.advanced.case001;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DoctorMapperTest {

    @Autowired
    private DoctorMapper doctorMapper;

    @Test
    public void test() {
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setName("张三");

        DoctorDto doctorDto = doctorMapper.doctorToDoctorDto(doctor);
        System.out.println(doctorDto);
    }
}
