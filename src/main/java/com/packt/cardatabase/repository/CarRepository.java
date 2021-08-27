package com.packt.cardatabase.repository;

import com.packt.cardatabase.domain.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car,Long> {

    Car getCarByRegisterNumber(@Param("registerNumber") String registerNumber);

    List<Car> findAllByBrand(@Param("brand")String brand);

    List<Car> findAllByModel(String model);

    @Query("select c from Car c where c.model like %?1")
    List<Car> findByModelEndsWith(String model);

}
