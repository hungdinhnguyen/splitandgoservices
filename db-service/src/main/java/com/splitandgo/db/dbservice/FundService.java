package com.splitandgo.db.dbservice;

import java.util.List;

import com.splitandgo.domain.Fund;


public interface FundService {

	public void save(Fund fund);

	public List<Fund> findAll();

	public Fund findOne(Long id);

}
