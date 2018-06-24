package com.splitandgo.db.dbservice.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitandgo.db.dbservice.ReportService;
import com.splitandgo.domain.Payment;

@Service
@Transactional
public class ReportServiceImpl implements ReportService {

	@Override
	public List<Payment> findPaymentsForReport(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] findPaymentsForReport(Long id, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
