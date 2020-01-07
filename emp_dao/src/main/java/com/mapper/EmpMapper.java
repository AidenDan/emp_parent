package com.mapper;

import com.pojo.Condition;
import com.pojo.Emp;
import com.pojo.EmpExample;
import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    public List<Emp> queryAllEmpActive(Condition condition);
}