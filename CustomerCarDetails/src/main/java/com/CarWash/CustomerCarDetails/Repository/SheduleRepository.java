package com.CarWash.CustomerCarDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CarWash.CustomerCarDetails.Model.SheduleModel;

@Repository
public interface SheduleRepository extends MongoRepository<SheduleModel, String>
{

}
