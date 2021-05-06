package com.project.controller;

import com.project.service.IParkLotService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Controller("carlots")
public class CarlotController {
    @Resource
    private IParkLotService parkLotService;
    @GetMapping("getSpotNum")
    public int getSpotNum(){
        return parkLotService.findSpotNum();
    }
}
