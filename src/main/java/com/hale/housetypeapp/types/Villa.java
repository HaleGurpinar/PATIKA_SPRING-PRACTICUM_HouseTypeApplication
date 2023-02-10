package com.hale.housetypeapp.types;

import com.hale.housetypeapp.base.BaseHouse;

public class Villa extends BaseHouse {

    public Villa(int totalPrice, int squareMeter, int roomNum, int loungeNum) {
        super(totalPrice, squareMeter, roomNum, loungeNum);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice();
    }

    @Override
    public void setTotalPrice(int totalPrice) {
        super.setTotalPrice(totalPrice);
    }

    @Override
    public int getSquareMeter() {
        return super.getSquareMeter();
    }

    @Override
    public void setSquareMeter(int squareMeter) {
        super.setSquareMeter(squareMeter);
    }

    @Override
    public int getRoomNum() {
        return super.getRoomNum();
    }

    @Override
    public void setRoomNum(int roomNum) {
        super.setRoomNum(roomNum);
    }

    @Override
    public int getLoungeNum() {
        return super.getLoungeNum();
    }

    @Override
    public void setLoungeNum(int loungeNum) {
        super.setLoungeNum(loungeNum);
    }

    @Override
    public String toString() {
        return
                "price=" + this.getTotalPrice() +
                        ", numberOfRooms=" + this.getRoomNum() +
                        ", numberOfLounge=" + this.getLoungeNum() +
                        ", squareMeterArea=" + this.getSquareMeter()
                ;
    }
}
