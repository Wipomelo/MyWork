package com.project.service;

import com.project.bean.ParkLotBean;

/**
 * 停车场业务类
 */
public interface IParkLotService {
    /**
     * 修改停车场停车位数量
     * @param num
     */
    void updateSpot(int num);

    /**
     * 查询停车场空闲停车位
     * @return
     */
    int findSpotNum();
}
