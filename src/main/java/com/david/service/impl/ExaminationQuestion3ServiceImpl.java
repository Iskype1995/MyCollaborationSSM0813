package com.david.service.impl;

import com.david.bean.ExaminationQuestion2;
import com.david.bean.ExaminationQuestion3;
import com.david.dao.ExaminationQuestion3Dao;
import com.david.service.ExaminationQuestion3Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ExaminationQuestion3ServiceImpl implements ExaminationQuestion3Service {

    @Resource
    private ExaminationQuestion3Dao examinationQuestion3Dao;

    @Override
    public List<ExaminationQuestion3> findAllEQ3() {
        return examinationQuestion3Dao.findAllEQ3();
    }

    @Override
    public ExaminationQuestion3 findByIdEQ3(int id) {
        return examinationQuestion3Dao.findByIdEQ3(id);
    }
}
