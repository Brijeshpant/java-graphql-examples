package com.brij.repositories;

import com.brij.entities.DepartmentEntity;
import com.brij.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
    public Optional<EmployeeEntity> findByIdAndDepartmentEntity(int id, DepartmentEntity department);

}
