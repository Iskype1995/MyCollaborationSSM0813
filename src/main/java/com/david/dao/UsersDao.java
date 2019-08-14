package com.david.dao;

import com.david.bean.*;

import java.util.List;

public interface UsersDao {

    //1.添加
    //int addUsers(Map map);
    //2.删除
    //int deleteUsers(int id);
    //3.更新
    //int updateUsers(Map map);
    //4.查询
    //Users findById(int id);
    //5.全查
    List<Users> findAll();
    //6.根据用户名称查询所有已做题目的编号1
    List<TestedQuestion1> findAllTestedQuestion1(String username);
    //7.根据用户名称查询所有已做题目的编号2
    List<TestedQuestion2> findAllTestedQuestion2(String username);
    //8.根据用户名称查询所有已做题目的编号3
    List<TestedQuestion3> findAllTestedQuestion3(String username);
    //9.根据用户名称查询所有已做题目的编号4
    List<TestedQuestion4> findAllTestedQuestion4(String username);
}
