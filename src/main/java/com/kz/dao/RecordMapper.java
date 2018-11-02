package com.kz.dao;

import com.kz.dto.RecordDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface RecordMapper {

    List<RecordDTO> getRecordList(Map<Object, Object> param);

    int insertRecord(RecordDTO recordDTO);
}
