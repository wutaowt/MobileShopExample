package com.huatec.edu.mobileshop.dao;

import java.util.List;
import java.util.Map;

import com.huatec.edu.mobileshop.entity.Member;

public interface MemberDao {
	public int save(Member member);

	public List<Member> findAll();

	public int updatePwdById(Map map);

	public int deleteById(int member_id);
	
	public Member findUnion(int member_id);
	
}
