package com.packt.cardatabase.repository;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    

}
