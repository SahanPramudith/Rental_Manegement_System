package com.icet.crm.Model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Customer {
    private Integer id;
    private String name;
    private String contact;
    private String city;
}
