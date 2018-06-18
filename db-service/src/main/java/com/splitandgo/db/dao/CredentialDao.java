package com.splitandgo.db.dao;

import com.splitandgo.domain.Credential;

public interface CredentialDao extends GenericDao<Credential> {
  
	public Credential findByUserName(String userName);
}
