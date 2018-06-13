package com.splitandgo.db.dao.impl;

import org.springframework.stereotype.Repository;

import com.splitandgo.db.dao.MemberDao;
import com.splitandgo.db.domain.Member;


@Repository
public class MemberDaoImpl extends GenericDaoImpl<Member> implements MemberDao {

	public MemberDaoImpl() {
		super.setDaoType(Member.class);
	}

}