package com.splitandgo.db.dbservice;



import com.splitandgo.domain.Payment;

import java.util.List;

public interface ReportService {

	List<Payment> findPaymentsForReport(Long id);
    byte[] findPaymentsForReport(Long id, String date);
}
