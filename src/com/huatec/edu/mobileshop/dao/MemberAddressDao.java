package com.huatec.edu.mobileshop.dao;

import java.util.List;

import com.huatec.edu.mobileshop.entity.MemberAddress;

public interface MemberAddressDao {
	
		public int save(MemberAddress ma);
		
		public List<MemberAddress> dynamicIfTest(MemberAddress ma);
		
		public List<MemberAddress> dynamicChooseTest(MemberAddress ma);
		
		public List<MemberAddress> dynamicTrimTest(MemberAddress ma);
		
		public List<MemberAddress> dynamicWhereTest(MemberAddress ma);
		
		public int dynamicSetTest(MemberAddress ma);
		
		public List<MemberAddress> dynamicForeachTest(MemberAddress ma);
		
		public List<MemberAddress> findUnion(int member_id);
		
}
