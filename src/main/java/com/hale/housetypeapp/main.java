package com.hale.housetypeapp;

import com.hale.housetypeapp.service.IBHouseService;
import com.hale.housetypeapp.service.IBHouseServiceImpl;

public class main {

    public static void main(String[] args) {

        IBHouseServiceImpl b =new IBHouseServiceImpl();
        System.out.println(b.getHouseTotalPrice());
        System.out.println(b.getVillaTotalPrice());
        System.out.println(b.getSummerHouseTotalPrice());
        //System.out.println(b.getAllPrice());
        System.out.println(b.getHouseAvgSqMeter());
        System.out.println(b.getVillaAvgSqMeter());
        System.out.println(b.getSummerHouseAvgSqMeter());
        System.out.println(b.getAllAverage());
        System.out.println(b.getAllFiltered(4,2));
        }





    }


