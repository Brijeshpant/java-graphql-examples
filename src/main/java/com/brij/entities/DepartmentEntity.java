package com.brij.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "departments")
public class DepartmentEntity {
    @Id
    int id;
    @Column
    String name;
    @Column
    String manager;
}
