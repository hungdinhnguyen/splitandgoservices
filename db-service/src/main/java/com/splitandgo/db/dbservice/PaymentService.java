package com.splitandgo.db.dbservice;

import java.util.List;

import com.splitandgo.domain.Payment;


public interface PaymentService {

	public void save(Payment payment);

	public Payment update(Payment payment);

	public void delete(Long id);

	public List<Payment> findAll();

	public Payment findOne(Long id);

	public List<Payment> findByTripId(Long tripId);

}
