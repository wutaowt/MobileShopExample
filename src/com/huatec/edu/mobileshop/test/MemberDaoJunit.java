package com.huatec.edu.mobileshop.test;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.huatec.edu.mobileshop.dao.MemberDao;
import com.huatec.edu.mobileshop.entity.Member;
import com.huatec.edu.mobileshop.entity.MemberAddress;
import com.huatec.edu.mobileshop.util.MyBatisUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberDaoJunit {
	
	SqlSession session =MyBatisUtil.getSqlSession();
	private  MemberDao memberDao  =session.getMapper(MemberDao.class) ;
	
	
	@Test
	public  void test1Insert(){
		System.out.println("==========insert========");
		Member  member  =new Member();
		member.setMember_id(null);
		member.setUname("吴涛");
		member.setPassword("123456");
		member.setEmail("ls@qq.com");
		member.setSex("0");
		member.setMobile("18656650212");
		
		member.setLastlogin(new  Timestamp(System.currentTimeMillis()));
		
		memberDao.save(member);
		session.commit();
		
		session.close();
	}
	
	//@Test
	public  void test2Select(){
		System.out.println("==========query after insert========");
		List<Member> datas =memberDao.findAll();
		for (Member member : datas) {
			System.out.println(member);
		}
	}
	
	//@Test
	public  void test3Update(){
		System.out.println("==========update========");
		Map map  =new HashMap();
		map.put("member_id", 5);
		map.put("password", "password");
		
		memberDao.updatePwdById(map);
		session.commit();
		session.close();
	}
	
	//@Test
	public  void test4Select(){
		System.out.println("==========query after update========");
		List<Member> datas =memberDao.findAll();
		for (Member member : datas) {
			System.out.println(member);
		}
	}
	
	//@Test
	public  void test5Delete(){
		System.out.println("==========delete========");
		memberDao.deleteById(5);
		session.commit();
		session.close();
	}
	
	//@Test
	public  void test6Select(){
		System.out.println("==========query after delete========");
		List<Member> datas =memberDao.findAll();
		for (Member member : datas) {
			System.out.println(member);
		}
	}
	
	//@Test
	public void testFindUion(){
		Member member = memberDao.findUnion(2);
		System.out.println(member);
		for (MemberAddress ma : member.getMemberAddress()) {
			System.out.println(ma);
		}
	}
	
}
