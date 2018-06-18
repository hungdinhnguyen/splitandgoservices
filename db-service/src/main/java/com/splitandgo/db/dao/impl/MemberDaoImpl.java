package com.splitandgo.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.splitandgo.db.dao.MemberDao;
import com.splitandgo.domain.Member;


@Repository
public class MemberDaoImpl extends GenericDaoImpl<com.splitandgo.domain.Member> implements MemberDao {

	public MemberDaoImpl() {
		super.setDaoType(Member.class);
	}

}