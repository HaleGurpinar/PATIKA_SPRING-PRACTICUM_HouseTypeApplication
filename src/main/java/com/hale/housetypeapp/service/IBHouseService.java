package com.hale.housetypeapp.service;

import com.hale.housetypeapp.base.BaseHouse;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;

public interface IBHouseService {

    int getHouseTotalPrice();
    int getVillaTotalPrice();
    int getSummerHouseTotalPrice();
    //Integer getAllPrice();
    OptionalDouble getHouseAvgSqMeter();
    OptionalDouble getVillaAvgSqMeter();
    OptionalDouble getSummerHouseAvgSqMeter();
    OptionalDouble getAllAverage();
    List<BaseHouse> getAllFiltered(int roomNum, int loungeNum);
}
