package com.splitandgo.db.dbservice;

import java.util.List;

import com.splitandgo.domain.Authority;


public interface AuthorityService {

	public void save(Authority authority);

	public List<Authority> findAll();

	public Authority findOne(Long id);

}
