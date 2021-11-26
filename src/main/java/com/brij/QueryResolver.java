package com.brij;

import com.brij.domains.Education;
import com.brij.domains.Employee;
import com.brij.services.EmployeeService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    @Autowired
    EmployeeService service;

    public List<Employee> employees() {
        return service.getEmployees();
    }

    public Employee employee(int id) {
        return service.getEmployee(id);
    }

    public List<Education> educations() {
        return service.getEducations();
    }
}
