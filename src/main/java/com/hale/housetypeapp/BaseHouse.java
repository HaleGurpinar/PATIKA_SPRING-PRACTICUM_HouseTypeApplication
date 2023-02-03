package com.hale.housetypeapp;

public abstract class BaseHouse {

    private int totalPrice;
    private int squareMeter;
    private int roomNum;
    private int loungeNum;


    public BaseHouse(int totalPrice, int squareMeter, int roomNum, int loungeNum) {
        this.totalPrice = totalPrice;
        this.squareMeter = squareMeter;
        this.roomNum = roomNum;
        this.loungeNum = loungeNum;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getLoungeNum() {
        return loungeNum;
    }

    public void setLoungeNum(int loungeNum) {
        this.loungeNum = loungeNum;
    }

    @Override
    public String toString() {
        return
                "price=" + totalPrice +
                        ", numberOfRooms=" + roomNum +
                        ", numberOfLounge=" + loungeNum +
                        ", squareMeterArea=" + squareMeter
                ;
    }
}
