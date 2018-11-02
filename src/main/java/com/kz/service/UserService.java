package com.kz.service;

import com.kz.annotation.LogInfo;
import com.kz.annotation.Printer;
import com.kz.dto.EcsGoods;
import com.kz.dto.EcsSpecificationDTO;
import com.kz.dto.RecordDTO;
import com.kz.dto.UserDTO;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserDTO> getKzMemberList(Map<Object, Object> param);

    int insertKzMember(UserDTO userDTO);

    public List<EcsGoods> getEcsGoodsList(EcsGoods ecsGoods);

    public List<EcsGoods> getGoodsListByCustomizedParams(Map<String, Object> params);

    public List<Map<Object, Object>> getGoodsIdsList(Map<String, Object> params);

    public int updateGoodsDescById(Map<Object, Object> params);

    @LogInfo("this is the annotation!!")
    @Printer(value = "@1", name = "my printer", date = "2018-10-11 14:58:00")
    public String anno();

    public int insertRecord(RecordDTO recordDTO);

    public List<RecordDTO> getRecordList(Map<Object, Object> params);

    public int insertEcsGoodsByCon(EcsGoods ecsGoods);

    public int insertEcsSpecificationDTO(EcsSpecificationDTO ecsSpecificationDTO);
}
