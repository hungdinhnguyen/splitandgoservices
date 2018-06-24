package com.splitandgo.db.dbservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitandgo.db.dao.FundDao;
import com.splitandgo.db.dbservice.FundService;
import com.splitandgo.domain.Fund;



@Service
@Transactional
public class FundServiceImpl implements FundService {

	@Autowired
	private FundDao fundDao;

	public void save(Fund fund) {
		fundDao.save(fund);
	}

	public List<Fund> findAll() {
		return (List<Fund>) fundDao.findAll();
	}

	public Fund findOne(Long id) {
		return fundDao.findOne(id);
	}

}
