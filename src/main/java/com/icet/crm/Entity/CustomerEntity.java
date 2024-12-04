package com.icet.crm.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "Customer")
public class CustomerEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String contact;
    private String city;
}
