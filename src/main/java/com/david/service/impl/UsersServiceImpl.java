package com.david.service.impl;

import com.david.bean.*;
import com.david.dao.UsersDao;
import com.david.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersDao usersDao;

    @Override
    public List<Users> findAll() {
        return usersDao.findAll();
    }

    @Override
    public List<TestedQuestion1> findAllTestedQuestion1(String username) {
        return usersDao.findAllTestedQuestion1(username);
    }

    @Override
    public List<TestedQuestion2> findAllTestedQuestion2(String username) {
        return usersDao.findAllTestedQuestion2(username);
    }

    @Override
    public List<TestedQuestion3> findAllTestedQuestion3(String username) {
        return usersDao.findAllTestedQuestion3(username);
    }

    @Override
    public List<TestedQuestion4> findAllTestedQuestion4(String username) {
        return usersDao.findAllTestedQuestion4(username);
    }
}
