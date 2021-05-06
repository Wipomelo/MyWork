package com.project.bean;



import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 停车记录表
 */

public class ParkLogBean {
    /**车牌号*/
    private String carId;
    /**汽车类别(小车=5，货车=10)*/
    private int carType;
    /**汽车状态*/
    private String status;
    /**停车开始时间*/
    private LocalDateTime inDate =LocalDateTime.now();
    /**停车结束时间*/
    private LocalDateTime outDate;
    /**停车费*/
    private double money;

    public ParkLogBean() {
    }

    public ParkLogBean(String carId,int carType, String status) {
        this.carId = carId;
        this.carType = carType;
        this.status = status;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
