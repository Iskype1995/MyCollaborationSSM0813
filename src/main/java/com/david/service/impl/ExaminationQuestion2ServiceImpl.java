package com.david.service.impl;

import com.david.bean.ExaminationQuestion2;
import com.david.dao.ExaminationQuestion2Dao;
import com.david.service.ExaminationQuestion2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ExaminationQuestion2ServiceImpl implements ExaminationQuestion2Service {

    @Resource
    private ExaminationQuestion2Dao examinationQuestion2Dao;

    @Override
    public List<ExaminationQuestion2> findAllEQ2() {
        return examinationQuestion2Dao.findAllEQ2();
    }

    @Override
    public ExaminationQuestion2 findByIdEQ2(int id) {
        return examinationQuestion2Dao.findByIdEQ2(id);
    }
}
