package com.huatec.edu.mobileshop.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.huatec.edu.mobileshop.dao.MemberAddressDao;
import com.huatec.edu.mobileshop.entity.MemberAddress;
import com.huatec.edu.mobileshop.util.MyBatisUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberAddressDaoJunit {
	
	SqlSession session =MyBatisUtil.getSqlSession();
	private  MemberAddressDao memberAddressDao  =session.getMapper(MemberAddressDao.class) ;
	
	
	@Test
	public  void test1Insert(){
		System.out.println("==========insert========");
		List<MemberAddress> list  =new ArrayList<MemberAddress>();
		
		list.add(new MemberAddress(2,2,"广东省","深圳市","南山区","西丽","13971986543","李素素",null,new Timestamp(System.currentTimeMillis())));
		list.add(new MemberAddress(3,2,"广东省","深圳市","南山区","西丽","13976543198","李诗诗",null,new Timestamp(System.currentTimeMillis())));
		list.add(new MemberAddress(4,2,"黑龙江省","哈尔滨市","南岗区","南岗","13576319854","李思思",null,new Timestamp(System.currentTimeMillis())));
		list.add(new MemberAddress(5,2,"广东省","深圳市","罗湖区","罗湖体育馆","13598763154","张丽丽",null,new Timestamp(System.currentTimeMillis())));
		list.add(new MemberAddress(6,2,"黑龙江省","哈尔滨市","道里区","和平路","13971986543","李素素",null,new Timestamp(System.currentTimeMillis())));
		list.add(new MemberAddress(7,2,"黑龙江省","哈尔滨市","道里区","和平路","13598763154","张丽丽",null,new Timestamp(System.currentTimeMillis())));
		list.add(new MemberAddress(8,2,"湖北省","武汉市","武昌区","武昌","13598763154","张丹丹",null,new Timestamp(System.currentTimeMillis())));
		
		
		for (MemberAddress memberAddress : list) {
			memberAddressDao.save(memberAddress);
		}
		
		session.commit();
		session.close();
	}
	
	
	//@Test
	public void testDynamicSet(){
		MemberAddress  ma =new MemberAddress();
		ma.setAddress_id(8);
		ma.setReceiver("吴涛");
		
		memberAddressDao.dynamicSetTest(ma);
		session.commit();
		session.close();
	}
	
	
	
}
