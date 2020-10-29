package com.brij.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Address {
    String addressLine1;
    String addressLine2;
    String city;
    String pinCOde;
    String state;
    String country;
}
