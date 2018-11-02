package com.kz.dao;

import java.util.List;

import com.kz.dao.base.EcsSpecificationBaseMapper;
import com.kz.dto.EcsSpecificationDTO;
import org.apache.ibatis.annotations.Param;

/**
*  @author author
*/
public interface EcsSpecificationMapper extends EcsSpecificationBaseMapper {

    int insertEcsSpecificationDTO(EcsSpecificationDTO object);
}