package com.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.project.bean.ParkLogBean;
import com.project.bean.ParkLotBean;
import com.project.dao.IParkLogDAO;
import com.project.service.IParkLogService;
import com.project.util.TimeCountUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class ParkLogServiceImpl implements IParkLogService {
    @Resource
    private IParkLogDAO parkLogDAO;
    @Resource
    private TimeCountUtil timeCountUtil;
    @Override
    public void addCar(ParkLogBean parkLogBean) {
        parkLogDAO.insert(parkLogBean);
    }

    @Override
    public void outCar(String carId) {
        ParkLogBean parkLogBean = parkLogDAO.selectById(carId);
        parkLogBean.setOutDate(LocalDateTime.now());
        int time = timeCountUtil.timeCount(parkLogBean.getInDate(), parkLogBean.getOutDate());
        parkLogBean.setMoney(time<=12 ? time*parkLogBean.getCarType():12*parkLogBean.getCarType());

    }

    @Override
    public double countTotalMoney(LocalDateTime date) {
        QueryWrapper<ParkLogBean> wrapper = new QueryWrapper();
        wrapper.eq("endDate", date);
        return  parkLogDAO.selectCount(wrapper);

    }

    @Override
    public ParkLogBean findByCarId(String carId) {
        return null;
    }
}
