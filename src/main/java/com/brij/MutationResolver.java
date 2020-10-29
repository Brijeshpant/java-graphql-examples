package com.brij;

import com.brij.domains.Employee;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(MutationResolver.class);

    public Employee createEmployee(CreateEmployee createEmployee) {
        LOGGER.info("data is {}", createEmployee);
        Employee employee = new Employee();
        employee.setId(1111);
        return employee;
    }
}
