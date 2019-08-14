package com.david.web;

import com.david.bean.*;
import com.david.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UsersController {

    @Resource
    private UsersService usersService;


    @RequestMapping(value = "/Users", produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<Users> findAllUsers(){
        return usersService.findAll();
    }

    @RequestMapping(value = "/TestedQuestion1/{username}", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map findAllTestedQuestion1(@PathVariable("username") String name){
        //得到所有该用户的已做题对象
        List<TestedQuestion1> allTestedQuestion1 = usersService.findAllTestedQuestion1(name);
        //抽取题目编号
        List<Integer> allTestedQuestionId1 = new ArrayList<>();
        for(TestedQuestion1 tq1: allTestedQuestion1){
            allTestedQuestionId1.add(tq1.getQuestionid());
        }
        //将题目编号集合包装成json集合
        Map map = new LinkedHashMap();
        map.put("code",0);
        map.put("msg","成功");
        map.put("username",name);
        map.put("questionid",allTestedQuestionId1);
        return map;
    }

    @RequestMapping(value = "/TestedQuestion2/{username}", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map findAllTestedQuestion2(@PathVariable("username") String name){
        //得到所有该用户的已做题对象
        List<TestedQuestion2> allTestedQuestion2 = usersService.findAllTestedQuestion2(name);
        //抽取题目编号
        List<Integer> allTestedQuestionId2 = new ArrayList<>();
        for(TestedQuestion2 tq2: allTestedQuestion2){
            allTestedQuestionId2.add(tq2.getQuestionid());
        }
        //将题目编号集合包装成json集合
        Map map = new LinkedHashMap();
        map.put("code",0);
        map.put("msg","成功");
        map.put("username",name);
        map.put("questionid",allTestedQuestionId2);
        return map;
    }

    @RequestMapping(value = "/TestedQuestion3/{username}", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map findAllTestedQuestion3(@PathVariable("username") String name){
        //得到所有该用户的已做题对象
        List<TestedQuestion3> allTestedQuestion3 = usersService.findAllTestedQuestion3(name);
        //抽取题目编号
        List<Integer> allTestedQuestionId3 = new ArrayList<>();
        for(TestedQuestion3 tq3: allTestedQuestion3){
            allTestedQuestionId3.add(tq3.getQuestionid());
        }
        //将题目编号集合包装成json集合
        Map map = new LinkedHashMap();
        map.put("code",0);
        map.put("msg","成功");
        map.put("username",name);
        map.put("questionid",allTestedQuestionId3);
        return map;
    }

    @RequestMapping(value = "/TestedQuestion4/{username}", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map findAllTestedQuestion4(@PathVariable("username") String name){
        //得到所有该用户的已做题对象
        List<TestedQuestion4> allTestedQuestion4 = usersService.findAllTestedQuestion4(name);
        //抽取题目编号
        List<Integer> allTestedQuestionId4 = new ArrayList<>();
        for(TestedQuestion4 tq4: allTestedQuestion4){
            allTestedQuestionId4.add(tq4.getQuestionid());
        }
        //将题目编号集合包装成json集合
        Map map = new LinkedHashMap();
        map.put("code",0);
        map.put("msg","成功");
        map.put("username",name);
        map.put("questionid",allTestedQuestionId4);
        return map;
    }

}
