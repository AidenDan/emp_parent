package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.Condition;
import com.pojo.Dept;
import com.pojo.Emp;

import java.util.List;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-9 14:55:35
 */
public interface ServiceInterface {
    //动态查询所有员工信息,封装在pageInfo
     PageInfo findAllEmpActive(Condition condition, Integer pageNum, Integer pageSize);
     //查询所有的部门用于回显
    List<Dept> findAllDept();
    //新增员工
    boolean addEmp(Emp emp);
    //根据id删除员工
    boolean remove(Integer eid);
    //根据id修改，先根据id查询
    Emp findEmpByEid(Integer eid);
    //修改
    boolean modifyEmp(Emp emp);

    //根据id查询一个
    List<Emp> findOne(Integer id);
}
