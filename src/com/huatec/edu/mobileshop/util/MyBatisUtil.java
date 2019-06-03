package com.huatec.edu.mobileshop.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	static Map<String, String> map = new HashMap<String, String>();
	
	static{
		Properties proper = new Properties();
		// 读取文件，我保存文件的位置在src/main/resource
		try {
			proper.load(MyBatisUtil.class.getClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String, String> map = new HashMap<String, String>();
		Iterator<Object> keys = proper.keySet().iterator();
		while (keys.hasNext()) {// 遍历文件内容
			String key = (String) keys.next();
			if (proper.getProperty(key) != null) {
				map.put(key, proper.getProperty(key).toString());// 保存在map中
			}
		}
		System.out.println(map);
	}
	
	public static SqlSession getSqlSession() {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		ClassLoader loader = MyBatisUtil.class.getClassLoader();
		InputStream inStream = loader.getResourceAsStream("SqlMapConfig.xml");

		SqlSessionFactory factory = builder.build(inStream);

		SqlSession session = factory.openSession();

		return session;
	}

	public static void main(String[] args) {
		SqlSession session = getSqlSession();
		System.out.println(session);
		session.close();
	}
	
}
