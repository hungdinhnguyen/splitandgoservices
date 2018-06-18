package com.splitandgo.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.splitandgo.db.dao.AuthorityDao;
import com.splitandgo.domain.Authority;



@Repository
public class AuthorityDaoImpl extends GenericDaoImpl<Authority> implements AuthorityDao {

	public AuthorityDaoImpl() {
		super.setDaoType(Authority.class);
	}

}