package com.icet.crm.Model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Rental {
    private Integer id;
    private LocalDate rentaldate;
    private LocalDate returndate;
    private LocalDate duedata;
    private Double toatconst;
}
