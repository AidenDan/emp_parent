package com.mapper;

import com.pojo.Computers;
import com.pojo.ComputersExample;
import java.util.List;

public interface ComputersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Computers record);

    int insertSelective(Computers record);

    List<Computers> selectByExample(ComputersExample example);

    Computers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Computers record);

    int updateByPrimaryKey(Computers record);
}