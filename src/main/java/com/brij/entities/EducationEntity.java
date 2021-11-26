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
@Entity(name = "educations")
public class EducationEntity {
    @Id
    @Column
    int id;
    @Column
    String degree;
    @Column
    String collage;
    @Column
    double marks;
}
