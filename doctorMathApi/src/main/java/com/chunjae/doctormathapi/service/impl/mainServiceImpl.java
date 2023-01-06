package com.chunjae.doctormathapi.service.impl;

import com.chunjae.doctormathapi.service.mainService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class mainServiceImpl implements mainService {

    @Override
    public Map<String, Object> getMainData() {

        Map<String, Object> mainData = new HashMap<>();
        mainData.put("label1", "check1");
        mainData.put("label2", "check2");
        mainData.put("label3", "check3");

        return mainData;
    }
}