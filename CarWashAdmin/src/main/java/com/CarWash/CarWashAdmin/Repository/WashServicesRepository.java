package com.CarWash.CarWashAdmin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CarWash.CarWashAdmin.Model.WashServicesModel;

@Repository
public interface WashServicesRepository extends MongoRepository<WashServicesModel, String>
{

}
