package com.david.web;

import com.david.bean.ExaminationQuestion2;
import com.david.service.ExaminationQuestion2Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
public class ExaminationQuestion2Controller {

    @Resource
    private ExaminationQuestion2Service examinationQuestion2Service;

    @RequestMapping(value = "/ExaminationQuestion2", produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<Map> ExaminationQuestion2() {
        List<ExaminationQuestion2> allEQ2 = examinationQuestion2Service.findAllEQ2();
        List<Map> allMap = new ArrayList();
        for (ExaminationQuestion2 eq2 : allEQ2) {
            Map map = new LinkedHashMap();
            map.put("code",0);
            map.put("msg","成功");
            map.put("data",eq2);
            allMap.add(map);
        }
        return allMap;
    }
    @RequestMapping(value = "/ExaminationQuestion2/{id}", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map findExaminationQuestion2ById(@PathVariable("id") Integer id){
        ExaminationQuestion2 eq2 = examinationQuestion2Service.findByIdEQ2(id);
        Map map = new LinkedHashMap();
        map.put("code",0);
        map.put("msg","成功");
        map.put("data",eq2);
        return map;
    }
}