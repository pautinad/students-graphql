package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.generated.Student;
import com.sample.graphql.generated.StudentQueryResolver;
import com.sample.graphql.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class StudentQueryResolverImpl implements StudentQueryResolver, GraphQLQueryResolver {

    private final StudentService studentService;

    @Override
    public Student student (String name) {
        return studentService.getStudentDetailsByName("Student-1");
    }
}
