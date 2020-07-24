package com.CarWash.CustomerRegister.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CarWash.CustomerRegister.Model.RegisterModel;

@Repository
public interface RegisterRepository extends MongoRepository<RegisterModel, String>
{

	
}
