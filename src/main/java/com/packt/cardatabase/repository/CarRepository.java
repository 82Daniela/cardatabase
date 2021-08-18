package com.packt.cardatabase.repository;

import com.packt.cardatabase.domain.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CarRepository extends CrudRepository<Car,Long> {

    Car getCarByRegisterNumber(String registerNumber);

    List<Car> findAllByBrand(String brand);

    List<Car> findAllByModel(String model);

    @Query("select c from Car c where c.model like %?1")
    List<Car> findByModelEndsWith(String model);

}
