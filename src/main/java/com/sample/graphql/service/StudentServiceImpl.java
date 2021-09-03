package com.sample.graphql.service;

import com.sample.graphql.generated.Address;
import com.sample.graphql.generated.Student;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Map<String, Student> students =
            Map.of("Student-1", Student.builder()
                            .setAddress(Address.builder()
                                    .setZipcode(420001)
                                    .setCity("Some City")
                                    .setStreet("Unknown street")
                                    .build())
                            .setAge(99)
                            .setName("Student-1")
                            .setPhone("+79000000001")
                            .build(),
                    "Student-2", Student.builder()
                            .setAddress(Address.builder()
                                    .setZipcode(420002)
                                    .setCity("Some Another City")
                                    .setStreet("Unknown street")
                                    .build())
                            .setAge(18)
                            .setName("Student-2")
                            .setPhone("+79000000002")
                            .build()
            );

    @Override
    public Student getStudentDetailsByName(String name) {
        if (StringUtils.isBlank(name)) {
            return null;
        }

        return students.get(name);
    }

}
