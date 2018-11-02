package com.kz.dao;

import com.kz.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface userMapper {

    List<UserDTO> getKzMemberList(Map<Object, Object> param);

    int insertKzMember(UserDTO userDTO);

}
