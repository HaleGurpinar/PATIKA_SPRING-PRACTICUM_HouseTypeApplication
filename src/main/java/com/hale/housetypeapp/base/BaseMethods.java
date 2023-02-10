package com.hale.housetypeapp.base;

import com.hale.housetypeapp.types.House;
import com.hale.housetypeapp.types.SummerHouse;
import com.hale.housetypeapp.types.Villa;

import java.util.ArrayList;
import java.util.List;

public class BaseMethods implements IBaseMethods {

    public House createHouse(int totalPrice, int squareMeter, int roomNum, int loungeNum) {
        return new House(totalPrice, squareMeter, roomNum, loungeNum);
    }

    public Villa createVilla(int totalPrice, int squareMeter, int roomNum, int loungeNum) {
        return new Villa(totalPrice, squareMeter, roomNum, loungeNum);
    }

    public SummerHouse createSummerHouse(int totalPrice, int squareMeter, int roomNum, int loungeNum) {
        return new SummerHouse(totalPrice, squareMeter, roomNum, loungeNum);
    }

    public List<BaseHouse> getBaseHouseList() {
        List<BaseHouse> allList = new ArrayList<>();
        allList.addAll(getHouseList());
        allList.addAll(getVillaList());
        allList.addAll(getSummerHouseList());
        return allList;
    }

    public List<House> getHouseList() {
        int h1Price = 160000;
        int h2Price = 340000;
        int h3Price = 460000;
        House h1 = createHouse(h1Price, 500, 2, 2);
        House h2 = createHouse(h2Price, 800, 4, 2);
        House h3 = createHouse(h3Price, 1200, 6, 4);
        List<House> houseList = new ArrayList<>();
        houseList.add(h1);
        houseList.add(h2);
        houseList.add(h3);
        return houseList;
    }

    public List<Villa> getVillaList() {

        int V1Price = 300000;
        int V2Price = 500000;
        int V3Price = 700000;
        Villa v1 = createVilla(V1Price, 200, 2, 2);
        Villa v2 = createVilla(V2Price, 400, 2, 4);
        Villa v3 = createVilla(V3Price, 1200, 4, 6);
        List<Villa> villaList = new ArrayList<>();
        villaList.add(v1);
        villaList.add(v2);
        villaList.add(v3);
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        int s1Price = 160000;
        int s2Price = 200000;
        int s3Price = 800000;
        SummerHouse s1 = createSummerHouse(s1Price, 500, 2, 2);
        SummerHouse s2 = createSummerHouse(s2Price, 600, 4, 2);
        SummerHouse s3 = createSummerHouse(s3Price, 900, 6, 2);
        List<SummerHouse> summerHouseList = new ArrayList<>();
        summerHouseList.add(s1);
        summerHouseList.add(s2);
        summerHouseList.add(s3);
        return summerHouseList;
    }


}
