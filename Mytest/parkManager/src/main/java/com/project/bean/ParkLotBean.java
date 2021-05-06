package com.project.bean;

public class ParkLotBean {
    private int id;
    /*停车位数量**/
    private int spotNum;

    public ParkLotBean() {
    }

    public ParkLotBean(int spotNum) {
        this.spotNum = spotNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpotNum() {
        return spotNum;
    }

    public void setSpotNum(int spotNum) {
        this.spotNum = spotNum;
    }
}
