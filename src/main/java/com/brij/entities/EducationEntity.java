package com.brij.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@NoArgsConstructor
//@Entity(name = "educations")
public class EducationEntity {
    String degree;
    String collage;
    double marks;
}
