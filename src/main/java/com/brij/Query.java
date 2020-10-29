package com.brij;

import com.brij.domains.Employee;
import com.brij.domains.Filter;
import com.brij.services.EmployeeService;
import com.brij.services.impl.EmployeeServiceImpl;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    EmployeeService employeeService;

    public List<Employee> employees() {
        List<Employee> employees = employeeService.getEmployees();
        LOGGER.info("Employees {} {} {}", employees);
        return employees;
    }

    public Employee employee(int id, int departmentId) {
        Employee employee = employeeService.getEmployee(id, departmentId);
        LOGGER.info("Employee {}", employee);
        return employee;
    }


}