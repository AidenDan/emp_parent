package com.controller;

import com.github.pagehelper.PageInfo;
import com.pojo.Condition;
import com.pojo.Dept;
import com.pojo.Emp;
import com.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2019-12-9 17:02:57
 */
@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    ServiceInterface serviceInterface;

    @RequestMapping("/list")
    public ModelAndView list(Condition condition,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             ModelAndView mv,
                             HttpSession session){
        PageInfo pageInfo = serviceInterface.findAllEmpActive(condition, pageNum, 5);
        mv.addObject("pageInfo", pageInfo);
        mv.addObject("condition", condition);
        List<Dept> deptList = serviceInterface.findAllDept();
        session.setAttribute("deptList", deptList);
        mv.setViewName("/jsp/main.jsp");
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView addEmp(Emp emp, ModelAndView mv){
        boolean b = serviceInterface.addEmp(emp);
        if(b){
            mv.addObject("msg01", "success");
        }else{
            mv.addObject("msg01", "fail");
        }
        mv.setViewName("/main/list");
        return mv;
    }

    @RequestMapping("/remove")
    public ModelAndView removeEmp(@RequestParam("delEid") Integer eid, ModelAndView mv){
        boolean b = serviceInterface.remove(eid);
        if(b){
            mv.addObject("msg02", "success");
        }else{
            mv.addObject("msg02", "fail");
        }
        mv.setViewName("/main/list");
        return mv;
    }

    //修改前先根据id查询所有
    @RequestMapping("/modify/{eid}")
    public ModelAndView modifyEmp(@PathVariable("eid") Integer eid, ModelAndView mv){
        Emp emp = serviceInterface.findEmpByEid(eid);
        mv.addObject("emp", emp);
        mv.setViewName("/jsp/modify.jsp");
        return mv;
    }

    @RequestMapping("/modify2")
    public ModelAndView modifyEmp2(Emp emp, ModelAndView mv){
        boolean b = serviceInterface.modifyEmp(emp);
        if(b){
            mv.addObject("msg03", "success");
        }else{
            mv.addObject("msg03", "fail");
        }
        mv.setViewName("/main/list");
        return mv;
    }
}




























