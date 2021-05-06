package com.project.service;

import com.project.bean.ParkLogBean;
import com.project.bean.ParkLotBean;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 停车记录业务类
 */
public interface IParkLogService {
    /**
     * 添加停车记录
     * @param parkLogBean 停车记录对象
     */
    void addCar( ParkLogBean parkLogBean);

    /**
     * 结算费用
     * @param carId
     */
    void outCar(String carId);

   /**
     * 统计当日总金额
     * @param date
     * @return
     */
    double countTotalMoney(LocalDateTime date);

    /**
     * 根据车牌号查询停车日志
     * @param carId 车牌号
     * @return
     */
    ParkLogBean findByCarId(String carId);
}
