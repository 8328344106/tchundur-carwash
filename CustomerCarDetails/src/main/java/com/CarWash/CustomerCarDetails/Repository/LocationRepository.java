package com.CarWash.CustomerCarDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CarWash.CustomerCarDetails.Model.LocationModel;

@Repository
public interface LocationRepository extends MongoRepository<LocationModel, String>
{

}
