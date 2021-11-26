package com.brij.mappers;

import com.brij.domains.Education;
import com.brij.domains.Employee;
import com.brij.entities.EducationEntity;
import com.brij.entities.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class EmployeeMapper {
    public static EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "department", source = "departmentEntity")
    public abstract Employee employeeBuilder(EmployeeEntity employeeEntity);

    public abstract Education educationBuilder(EducationEntity educationEntity);


}
