package com.david.dao;

import com.david.bean.ExaminationQuestion3;

import java.util.List;

public interface ExaminationQuestion3Dao {

    //1.全查
    List<ExaminationQuestion3> findAllEQ3();

    //2.按id查
    ExaminationQuestion3 findByIdEQ3(int id);
}
