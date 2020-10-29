package com.brij.mappers;

import com.brij.domains.Employee;
import com.brij.entities.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class EmployeeMapper {
    public static EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mappings({
            @Mapping(source = "FName", target = "personalDetails.FName"),
            @Mapping(source = "LName", target = "personalDetails.LName"),
            @Mapping(source = "dob", target = "personalDetails.dob"),
            @Mapping(source = "father", target = "personalDetails.father"),
            @Mapping(source = "email", target = "personalDetails.email"),
            @Mapping(source = "addressEntity", target = "address"),
            @Mapping(source = "departmentEntity", target = "department")
    })
    public abstract Employee employeeBuilder(EmployeeEntity employeeEntity);


}
