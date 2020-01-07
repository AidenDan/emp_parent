package com.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.DeptMapper;
import com.mapper.EmpMapper;
import com.pojo.Condition;
import com.pojo.Dept;
import com.pojo.Emp;
import com.pojo.EmpExample;
import com.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-9 15:29:13
 */
@Service("serviceInterfaceImpl")
public class ServiceInterfaceImpl implements ServiceInterface {
    @Autowired
    EmpMapper empMapper;
    @Autowired
    DeptMapper deptMapper;

    @Override
    public PageInfo findAllEmpActive(Condition condition, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        //根据condition动态查询
        List<Emp> empList = empMapper.queryAllEmpActive(condition);
        PageInfo pageInfo = new PageInfo(empList);
        return pageInfo;
    }

    @Override
    public List<Dept> findAllDept() {
        List<Dept> deptList = deptMapper.queryAllDept();
        return deptList;
    }

    @Override
    public boolean addEmp(Emp emp) {
        int i = empMapper.insert(emp);
        return i>0;
    }

    @Override
    public boolean remove(Integer eid) {
        int i = empMapper.deleteByPrimaryKey(eid);
        return i>0;
    }

    @Override
    public Emp findEmpByEid(Integer eid) {
        Emp emp = empMapper.selectByPrimaryKey(eid);
        return emp;
    }

    @Override
    public boolean modifyEmp(Emp emp) {
        int i = empMapper.updateByPrimaryKey(emp);
        return i>0;
    }

    @Override
    public List<Emp> findOne(Integer id) {
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        EmpExample.Criteria criteria1 = criteria.andEidEqualTo(id);
        return empMapper.selectByExample(empExample);
    }
}

















