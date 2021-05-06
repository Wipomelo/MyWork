package com.project.controller;

import com.project.bean.ParkLogBean;
import com.project.service.IParkLogService;
import com.project.service.IParkLotService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.time.LocalDateTime;


@Controller("carlogs")
public class CarLogController {
    @Resource
    private IParkLogService parkLogService;
    @Resource
    private IParkLotService parkLotService;

    @PostMapping("addCar")
    public String addCar(ParkLogBean parkLogBean){
        parkLogService.addCar(parkLogBean);
        parkLotService.updateSpot(-1);
        return "ok";
    }

    @PostMapping("outCar")
    public String outCar(String carId){
        parkLogService.outCar(carId);
        parkLotService.updateSpot(1);
        return "ok";
    }

    @GetMapping("countMoney")
    public double getTotalMoney(LocalDateTime localDateTime){
        return  parkLogService.countTotalMoney(localDateTime);
    }
}
