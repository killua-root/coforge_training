package com.coforge.d3;

public class MobileApp {

    public static void main(String[] args) {

        Mobile mob = new Mobile();

        mob.setBrand("Samsung");
        mob.setModel("Galaxy S25");
        mob.setRam(12);
        mob.setPrice(84999);

        System.out.println(mob);

    }
}