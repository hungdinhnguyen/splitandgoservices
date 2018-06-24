package com.splitandgo.db.dbservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitandgo.db.dao.AuthorityDao;
import com.splitandgo.db.dbservice.AuthorityService;
import com.splitandgo.domain.Authority;


@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;

	public void save(Authority member) {
		authorityDao.save(member);
	}

	public List<Authority> findAll() {
		return (List<Authority>) authorityDao.findAll();
	}

	public Authority findOne(Long id) {
		return authorityDao.findOne(id);
	}

}
