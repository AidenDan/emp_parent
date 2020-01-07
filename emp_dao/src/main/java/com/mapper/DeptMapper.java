package com.mapper;

import com.pojo.Dept;
import com.pojo.DeptExample;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    @Select("select * from dept")
    List<Dept> queryAllDept();
}