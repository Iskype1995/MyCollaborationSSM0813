package com.david.web;

import com.david.bean.ExaminationQuestion3;
import com.david.service.ExaminationQuestion3Service;
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
public class ExaminationQuestion3Controller {

    @Resource
    private ExaminationQuestion3Service examinationQuestion3Service;

    @RequestMapping(value = "/ExaminationQuestion3", produces = "application/json; charset=utf-8")
    @ResponseBody
    public List<Map> ExaminationQuestion3() {
        List<ExaminationQuestion3> allEQ3 = examinationQuestion3Service.findAllEQ3();
        List<Map> allMap = new ArrayList();
        for (ExaminationQuestion3 eq3 : allEQ3) {
            Map map = new LinkedHashMap();
            map.put("code",0);
            map.put("msg","成功");
            map.put("data",eq3);
            allMap.add(map);
        }
        return allMap;
    }
    @RequestMapping(value = "/ExaminationQuestion3/{id}", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map findExaminationQuestion3ById(@PathVariable("id") Integer id){
        ExaminationQuestion3 eq3 = examinationQuestion3Service.findByIdEQ3(id);
        Map map = new LinkedHashMap();
        map.put("code",0);
        map.put("msg","成功");
        map.put("data",eq3);
        return map;
    }

}