package com.brij.services;

import com.brij.domains.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee getEmployee(int id, int department);

}
