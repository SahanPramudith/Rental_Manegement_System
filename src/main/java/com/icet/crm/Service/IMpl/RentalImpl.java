package com.icet.crm.Service.IMpl;

import com.icet.crm.Entity.RentalEntity;
import com.icet.crm.Model.Rental;
import com.icet.crm.Repository.RentalRepository;
import com.icet.crm.Service.RentalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RentalImpl implements RentalService {
    @Autowired
    ModelMapper mapper;
    @Autowired
    RentalRepository repository;


    @Override
    public void save(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public List<Rental> getAll() {
        ArrayList<Rental> getAll = new ArrayList<>();
        for (RentalEntity rentalEntity : repository.findAll()) {
            getAll.add(mapper.map(rentalEntity, Rental.class));
        }

        return List.of();
    }
}
