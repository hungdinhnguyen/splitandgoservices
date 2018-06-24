package com.splitandgo.db.dbservice;

import java.util.List;

import com.splitandgo.domain.Member;


public interface MemberService {

	public void save(Member member);

	public Member update(Member member);
		
	public List<Member> findAll();

	public Member findOne(Long id);
	
	public void delete(Long id);

}
