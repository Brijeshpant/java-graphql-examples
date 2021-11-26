package com.brij.services.impl;

import com.brij.domains.Education;
import com.brij.domains.Employee;
import com.brij.entities.EducationEntity;
import com.brij.entities.EmployeeEntity;
import com.brij.mappers.EmployeeMapper;
import com.brij.repositories.EducationRepo;
import com.brij.repositories.EmployeeRepo;
import com.brij.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    EducationRepo educationRepo;

    @Override
    public List<Employee> getEmployees() {
        List<EmployeeEntity> employees = employeeRepo.findAll();
        LOGGER.info("Employees {}", employees);
        return employees.stream().map(EmployeeMapper.INSTANCE::employeeBuilder).collect(Collectors.toList());
    }

    @Override
    public Employee getEmployee(int id) {
        Optional<EmployeeEntity> optionalEmployeeEntity = employeeRepo.findById(id);

        LOGGER.info("Employee {}", optionalEmployeeEntity);
        return optionalEmployeeEntity.map(employeeEntity -> EmployeeMapper.INSTANCE.employeeBuilder(employeeEntity)).orElse(null);
    }

    @Override
    public List<Education> getEducations() {
        List<EducationEntity> all = educationRepo.findAll();
        return all.stream().map(educationEntity -> EmployeeMapper.INSTANCE.educationBuilder(educationEntity)).collect(Collectors.toList());
    }
}
