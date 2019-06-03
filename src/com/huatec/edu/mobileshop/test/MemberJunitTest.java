package com.huatec.edu.mobileshop.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.huatec.edu.mobileshop.entity.Member;
import com.huatec.edu.mobileshop.util.MyBatisUtil;

public class MemberJunitTest {

	//@Test
	public void testInsert() {
		SqlSession session = MyBatisUtil.getSqlSession();

		Member member = new Member();
		member.setMember_id(null);
		member.setUname("吴涛");
		member.setPassword("123456");
		member.setEmail("ls@qq.com");
		member.setSex("0");
		member.setMobile("13338875863");
		// member.setRegtime(new Timestamp(System.currentTimeMillis()));
		// member.setLastlogin(new Timestamp(System.currentTimeMillis()));

		member.setRegtime(null);
		member.setLastlogin(null);

		session.insert("save", member);
		session.commit();

		session.close();
	}

	//@Test
	public void testSelect() {
		SqlSession session = MyBatisUtil.getSqlSession();
		List<Member> datas = session.selectList("findAll");
		for (Member member : datas) {
			System.out.println(member);
		}
	}

	//@Test
	public void testUpdate() {
		SqlSession session = MyBatisUtil.getSqlSession();
		Map map = new HashMap();
		map.put("member_id", 5);
		map.put("password", "password");
		session.update("updatePwdById", map);
		session.commit();
		session.close();
	}

	//@Test
	public void testDelete() {
		SqlSession session = MyBatisUtil.getSqlSession();
		session.delete("deleteById", 5);
		session.commit();
		session.close();
	}
	
	

}
