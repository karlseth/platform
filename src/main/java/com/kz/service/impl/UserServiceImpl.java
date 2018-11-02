package com.kz.service.impl;

import com.kz.dao.EcsGoodsMapper;
import com.kz.dao.EcsSpecificationMapper;
import com.kz.dao.RecordMapper;
import com.kz.dao.base.EcsGoodsBaseMapper;
import com.kz.dao.base.EcsSpecificationBaseMapper;
import com.kz.dao.userMapper;
import com.kz.dto.EcsGoods;
import com.kz.dto.EcsSpecificationDTO;
import com.kz.dto.RecordDTO;
import com.kz.dto.UserDTO;
import com.kz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private userMapper userMapper;

    @Autowired
    private EcsGoodsBaseMapper ecsGoodsBaseMapper;

    @Autowired
    private EcsGoodsMapper ecsGoodsMapper;

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private EcsSpecificationMapper ecsSpecificationMapper;


    public List<UserDTO> getKzMemberList(Map<Object, Object> param) {
        return userMapper.getKzMemberList(param);
    }


    public int insertKzMember(UserDTO userDTO) {
        return userMapper.insertKzMember(userDTO);
    }


    public List<EcsGoods> getEcsGoodsList(EcsGoods ecsGoods) {
        return ecsGoodsBaseMapper.queryEcsGoods(ecsGoods);
    }

    public List<EcsGoods> getGoodsListByCustomizedParams(Map<String, Object> params) {
        return ecsGoodsMapper.getGoodsListByCustomizedParams(params);
    }

    public List<Map<Object, Object>> getGoodsIdsList(Map<String, Object> params) {
        return ecsGoodsMapper.getGoodsIdsList(params);
    }

    public int updateGoodsDescById(Map<Object, Object> params) {
        return ecsGoodsMapper.updateGoodsDescById(params);
    }


    public String anno() {

        System.out.println("in class invoking method anno");

        return null;
    }

    public List<RecordDTO> getRecordList(Map<Object, Object> params) {
        return recordMapper.getRecordList(params);
    }

    public int insertRecord(RecordDTO recordDTO) {
        return recordMapper.insertRecord(recordDTO);
    }


    public int insertEcsGoodsByCon(EcsGoods ecsGoods){
        return ecsGoodsMapper.insertEcsGoodsByCon(ecsGoods);
    }

    public int insertEcsSpecificationDTO(EcsSpecificationDTO ecsSpecificationDTO){
        return ecsSpecificationMapper.insertEcsSpecificationDTO(ecsSpecificationDTO);
    }
}
