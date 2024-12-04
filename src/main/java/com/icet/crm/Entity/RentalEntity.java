package com.icet.crm.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
@Table(name = "Rental")
public class RentalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate rentaldate;
    private LocalDate returndate;
    private LocalDate duedata;
    private Double toatconst;
}
