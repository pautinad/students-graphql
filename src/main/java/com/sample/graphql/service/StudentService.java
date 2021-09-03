package com.sample.graphql.service;

import com.sample.graphql.generated.Student;

public interface StudentService {

    Student getStudentDetailsByName(String name);

}
