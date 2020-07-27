package com.CarWash.CustomerCarDetails.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CarWash.CustomerCarDetails.Model.PaymentModel;

@Repository
public interface PaymentRepository extends MongoRepository<PaymentModel, String>
{

}
