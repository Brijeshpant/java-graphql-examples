package com.brij.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    int id;
    PersonalDetails personalDetails;
    Address address;
    List<Education> educations;
    Department department;

}
