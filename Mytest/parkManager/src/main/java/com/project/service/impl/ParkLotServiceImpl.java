package com.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.project.bean.ParkLotBean;
import com.project.dao.IParkLotDAO;
import com.project.service.IParkLotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ParkLotServiceImpl implements IParkLotService {
    @Resource
    private IParkLotDAO parkLotDAO;
    @Override
    public void updateSpot(int num) {
        ParkLotBean parkLotBean = parkLotDAO.selectById(1);
        parkLotBean.setSpotNum(parkLotBean.getSpotNum()+num);
        parkLotDAO.updateById(parkLotBean);
    }

    @Override
    public int findSpotNum() {
        return parkLotDAO.selectCount(new QueryWrapper<ParkLotBean>().eq("id", 1));
    }
}
