package com.huatec.edu.mobileshop.dao;

import java.util.List;
import java.util.Map;

import com.huatec.edu.mobileshop.entity.GoodsType;

public interface GoodsTypeDao {
	public int save(GoodsType GoodsType);

	public List<GoodsType> findAll();

	public int deleteById(int type_id);

	public GoodsType findById(int type_id);
}
