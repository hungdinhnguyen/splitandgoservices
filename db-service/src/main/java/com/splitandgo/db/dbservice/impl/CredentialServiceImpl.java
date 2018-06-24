package com.splitandgo.db.dbservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.splitandgo.db.dao.CredentialDao;
import com.splitandgo.db.dbservice.CredentialService;
import com.splitandgo.domain.Credential;



@Service
@Transactional
public class CredentialServiceImpl implements CredentialService {

	@Autowired
	private CredentialDao userCredentialsDao;

	public void save(Credential userCredentials) {
		userCredentialsDao.save(userCredentials);
	}

	public void update(Credential userCredentials) {
		userCredentialsDao.update(userCredentials);
	}

	public List<Credential> findAll() {
		return (List<Credential>) userCredentialsDao.findAll();
	}

	public Credential findOne(Long id) {
		return userCredentialsDao.findOne(id);
	}

	public Credential findByUserName(String userName) {
		return userCredentialsDao.findByUserName(userName);
	}

}
