package com.splitandgo.db.dbservice.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitandgo.db.dbservice.PaymentService;
import com.splitandgo.domain.Payment;



@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void save(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment update(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findByTripId(Long tripId) {
		// TODO Auto-generated method stub
		return null;
	}



}
