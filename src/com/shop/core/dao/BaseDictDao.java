package com.shop.core.dao;
import java.util.List;
import com.shop.core.po.BaseDict;
/**
 * �����ֵ�
 */
public interface BaseDictDao {
	// �����������ѯ�����ֵ�
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
