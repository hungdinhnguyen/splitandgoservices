package com.splitandgo.db.dbservice;

import java.util.List;

import com.splitandgo.domain.Credential;

 
public interface CredentialService {

	public void save(Credential userCredentials);
	public void update(Credential userCredentials);
	public List<Credential> findAll();
	public Credential findOne(Long id);
	public Credential findByUserName(String userName);
 }
