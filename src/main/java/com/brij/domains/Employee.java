package com.brij.domains;

import lombok.*;

@Data
public class Employee {
    int id;
    String name;
    String email;
    Department department;

}
