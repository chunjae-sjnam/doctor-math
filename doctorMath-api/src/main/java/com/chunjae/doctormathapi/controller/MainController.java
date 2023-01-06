package com.chunjae.doctormathapi.controller;

import com.chunjae.doctormathapi.service.mainService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * main/index
 */
@RestController
@RequiredArgsConstructor
public class MainController {

    private final mainService mainService;

    @RequestMapping("/main")
    public Map<String ,Object> mainController(){

        return mainService.getMainData();
    }
}
