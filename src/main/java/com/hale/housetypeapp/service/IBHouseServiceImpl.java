package com.hale.housetypeapp.service;

import com.hale.housetypeapp.base.BaseHouse;
import com.hale.housetypeapp.base.BaseMethods;
import com.hale.housetypeapp.base.IBaseMethods;
import com.hale.housetypeapp.types.House;
import com.hale.housetypeapp.types.SummerHouse;
import com.hale.housetypeapp.types.Villa;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class IBHouseServiceImpl implements IBHouseService{

    protected IBaseMethods baseMethods;

    public IBHouseServiceImpl(){
        this.baseMethods=new BaseMethods();
    }
    public int getHouseTotalPrice() {
        List<House> houseList = this.baseMethods.getHouseList();
        int sum = 0;
        for (House house : houseList) {
            int price = house.getTotalPrice();
            sum =sum +price;
        }
        return sum;
    }


    public int getVillaTotalPrice() {
        List<Villa> villaList = this.baseMethods.getVillaList();
        int sum = 0;
        for (Villa villa : villaList) {
            int price = villa.getTotalPrice();
            sum =sum +price;
        }
        return sum;
    }


    public int getSummerHouseTotalPrice() {
        List<SummerHouse> summerHouseList = this.baseMethods.getSummerHouseList();
        int sum = 0;
        for (SummerHouse summerHouse : summerHouseList) {
            int price = summerHouse.getTotalPrice();
            sum =sum +price;
        }
        return sum;
    }


   /* public Integer getAllPrice() {
        Integer sum = int.valueOf(0).add(getHouseTotalPrice())
                .add(getVillaTotalPrice())
                .add(getSummerHouseTotalPrice());
        return sum;
    }*/


    public OptionalDouble getHouseAvgSqMeter() {
        List<House> houseList = this.baseMethods.getHouseList();
        OptionalDouble average = OptionalDouble.of(houseList.stream().filter(o -> o.getSquareMeter() > 0)
                .mapToDouble(o -> o.getSquareMeter()).average().orElse(0));
        return average;
    }


    public OptionalDouble getVillaAvgSqMeter() {
        List<Villa> villaList = this.baseMethods.getVillaList();
        OptionalDouble average = OptionalDouble.of(villaList.stream().filter(o -> o.getSquareMeter() > 0)
                .mapToDouble(o -> o.getSquareMeter()).average().orElse(0));
        return average;
    }


    public OptionalDouble getSummerHouseAvgSqMeter() {
        List<SummerHouse> summerHouseList = this.baseMethods.getSummerHouseList();
        OptionalDouble average = OptionalDouble.of(summerHouseList.stream().filter(o -> o.getSquareMeter() > 0)
                .mapToDouble(o -> o.getSquareMeter()).average().orElse(0));
        return average;
    }


    public OptionalDouble getAllAverage() {
        OptionalDouble average = OptionalDouble.of((getSummerHouseAvgSqMeter().getAsDouble() +
                getHouseAvgSqMeter().getAsDouble() +
                getVillaAvgSqMeter().getAsDouble()) / 3);

        return average;
    }


    public List<BaseHouse> getAllFiltered(int roomNum, int loungeNum) {
        List<BaseHouse> houses = this.baseMethods.getBaseHouseList();

        List<BaseHouse> result = houses.stream().filter(o -> o.getRoomNum() == roomNum && o.getLoungeNum() == loungeNum)
                .collect(Collectors.toList());
        if (result.isEmpty()) {
            throw new IllegalArgumentException("There is no house with this room number and saloon number");
        }
        ;
        return result;
    }
}
