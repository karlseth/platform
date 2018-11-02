package com.kz.dao;

import java.util.List;
import java.util.Map;

import com.kz.dao.base.EcsGoodsBaseMapper;
import com.kz.dto.EcsGoods;
import org.apache.ibatis.annotations.Param;

/**
*  @author author
*/
public interface EcsGoodsMapper extends EcsGoodsBaseMapper {

    public List<EcsGoods> getGoodsListByCustomizedParams(Map<String, Object> params);

    public List<Map<Object, Object>> getGoodsIdsList(Map<String, Object> params);

    public int updateGoodsDescById(Map<Object, Object> params);

    public int insertEcsGoodsByCon(EcsGoods ecsGoods);

}