package com.splitandgo.db.dao;

import java.util.List;

import com.splitandgo.db.domain.Payment;


public interface PaymentDao extends GenericDao<Payment > {

	public List<Payment> findByTripId(Long id);
    public List<Payment> findPaymentsForReport(Long id);
}
