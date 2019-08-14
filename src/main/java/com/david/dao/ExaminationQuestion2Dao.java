package com.david.dao;

import com.david.bean.ExaminationQuestion2;

import java.util.List;

public interface ExaminationQuestion2Dao {

    //1.全查
    List<ExaminationQuestion2> findAllEQ2();

    //2.按id查
    ExaminationQuestion2 findByIdEQ2(int id);
}
