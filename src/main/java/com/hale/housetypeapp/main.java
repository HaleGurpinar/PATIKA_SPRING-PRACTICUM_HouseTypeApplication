package com.hale.housetypeapp;

public class main {

    public static void main(String[] args) {

        BaseHouse v= new Villa(200000,450,3,1);
        System.out.println("Villa "+v);

        BaseHouse h= new House(600000,600,4,1);
        System.out.println("House "+h);

        BaseHouse s= new SummerHouse(100000,300,2,1);
        System.out.println("SummerHouse "+s);




    }

}
