package com.splitandgo.db.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.splitandgo.db.dao.CredentialDao;
import com.splitandgo.domain.Credential;

@Repository
public class CredentialDaoImpl extends GenericDaoImpl<Credential> implements CredentialDao {

	public CredentialDaoImpl() {
		super.setDaoType(Credential.class);
	}

	public Credential findByUserName(String userName) {

		Query query = entityManager.createQuery("select m from CREDENTIALS m  where m.username =:userName");
		return (Credential) query.setParameter("userName", userName).getSingleResult();

	}

}