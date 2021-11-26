package com.brij.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@Entity(name = "addresses")
public class AddressEntity {
    @Id
    int id;
    String addressLine1;
    String city;
}
