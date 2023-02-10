package com.hale.housetypeapp.base;

import com.hale.housetypeapp.types.House;
import com.hale.housetypeapp.types.SummerHouse;
import com.hale.housetypeapp.types.Villa;

import java.util.List;

public interface IBaseMethods {

    List<BaseHouse> getBaseHouseList();
    List<House> getHouseList();
    List<Villa> getVillaList();
    List<SummerHouse> getSummerHouseList();
    House createHouse(int totalPrice, int squareMeter, int roomNum, int loungeNum);
    Villa createVilla(int totalPrice, int squareMeter, int roomNum, int loungeNum);
    SummerHouse createSummerHouse(int totalPrice, int squareMeter, int roomNum, int loungeNum);

}
