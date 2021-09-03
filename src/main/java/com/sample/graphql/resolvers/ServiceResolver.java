package com.sample.graphql.resolvers;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.generated._Service;
import com.sample.graphql.generated._serviceQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ServiceResolver implements _serviceQueryResolver, GraphQLQueryResolver {

    @Override
    public _Service _service() throws Exception {
        log.info("send current schema");
        return new _Service("schema {\n" +
                "    query: Query\n" +
                "}\n" +
                "\n" +
                "type Query {\n" +
                "    _service: _Service\n" +
                "    student(name:String) : Student\n" +
                "}\n" +
                "\n" +
                "type Address {\n" +
                "    street: String!,\n" +
                "    city:   String!,\n" +
                "    zipcode: Int!\n" +
                "}\n" +
                "\n" +
                "type Student {\n" +
                "    name: String!\n" +
                "    age: Int!\n" +
                "    phone: String\n" +
                "    address: Address!\n" +
                "}\n" +
                "\n" +
                "type _Service { sdl:String! }\n" +
                "\n");
    }
}
