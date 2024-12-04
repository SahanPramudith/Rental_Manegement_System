package com.icet.crm.Service;

import com.icet.crm.Model.Rental;

import java.util.List;

public interface RentalService {
    void save(Rental rental);

    List<Rental> getAll();
}
