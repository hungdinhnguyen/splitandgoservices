package com.splitandgo.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.splitandgo.db.dao.FundDao;
import com.splitandgo.db.domain.Fund;



@Repository
public class FundDaoImpl extends GenericDaoImpl<Fund> implements FundDao {

	public FundDaoImpl() {
		super.setDaoType(Fund.class);
	}

}