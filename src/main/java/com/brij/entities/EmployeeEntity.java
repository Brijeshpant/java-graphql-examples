package com.brij.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "employees")
public class EmployeeEntity {
    @Id
    int id;
    @Column
    String fName;
    @Column
    String lName;
    @Column
    String dob;
    @Column
    String mobile;
    @Column
    String father;
    @Column
    String email;
    @Column
    int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private DepartmentEntity departmentEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressEntity addressEntity;

}
