package com.brij.domains;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class PersonalDetails {
    String fName;
    String lName;
    String dob;
    String mobile;
    String father;
    String email;
    int age;

}
