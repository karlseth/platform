package com.kz.dao.base;

import java.util.List;

import com.kz.dto.EcsGoods;
import org.springframework.stereotype.Repository;

/**
*  @author author
*/
@Repository
public interface EcsGoodsBaseMapper {


    int updateEcsGoods(EcsGoods object);

    int update(EcsGoods.UpdateBuilder object);

    List<EcsGoods> queryEcsGoods(EcsGoods object);

    EcsGoods queryEcsGoodsLimit1(EcsGoods object);

}