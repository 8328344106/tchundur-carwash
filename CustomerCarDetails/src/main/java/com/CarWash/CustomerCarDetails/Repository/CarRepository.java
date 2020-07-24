package com.CarWash.CustomerCarDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CarWash.CustomerCarDetails.Model.CarModel;

@Repository
public interface CarRepository extends MongoRepository<CarModel, String>
{

}
