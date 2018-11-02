package com.kz.dao.base;


import com.kz.dto.EcsSpecificationDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
*  @author author
*/
@Repository
public interface EcsSpecificationBaseMapper {


    int updateEcsSpecificationDTO(EcsSpecificationDTO object);

    int update(EcsSpecificationDTO.UpdateBuilder object);

    List<EcsSpecificationDTO> queryEcsSpecificationDTO(EcsSpecificationDTO object);

    EcsSpecificationDTO queryEcsSpecificationDTOLimit1(EcsSpecificationDTO object);

}