package com.splitandgo.db.dbservice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.splitandgo.db.dao.MemberDao;
import com.splitandgo.db.dbservice.CredentialService;
import com.splitandgo.db.dbservice.MemberService;
import com.splitandgo.domain.Authority;
import com.splitandgo.domain.Member;



@Service
@Transactional
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Autowired
	CredentialService credentialsService;

	public void save(Member member) {
		updateAuthorities(member.getCredential().getAuthorityList(), member.getCredential().getAuthorities());
		memberDao.update(member); // credential is detached during creating
	}

	public Member update(Member member) {
		updateAuthorities(member.getCredential().getAuthorityList(), member.getCredential().getAuthorities());
		return memberDao.update(member);
	}

	private void updateAuthorities(List<String> authorityStrList, List<Authority> authorities) {
		if (authorities.size() > 0) {
			authorities.clear();
		}
		for (String authorityStr : authorityStrList) {
			if (!StringUtils.isEmpty(authorityStr)) {
				Authority authority = new Authority();
				authority.setAuthority(authorityStr);
				if (!authorities.contains(authority)) {
					authorities.add(authority);
				}
			}
		}
	}

	public List<Member> findAll() {
		return (List<Member>) memberDao.findAll();
	}

	public Member findOne(Long id) {
		Member member = memberDao.findOne(id);
		setAuthorityList(member);
		return member;
	}

	private void setAuthorityList(Member member) {
		List<String> authorityList = new ArrayList<>();
		for (Authority authority : member.getCredential().getAuthorities()) {
			authorityList.add(authority.getAuthority());
		}
		member.getCredential().setAuthorityList(authorityList);
	}
	
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@Logging
	public void delete(Long id) {
		memberDao.delete(id);
	}

}
