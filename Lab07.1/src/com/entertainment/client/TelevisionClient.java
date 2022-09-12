package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Zenith");
    tv1.setVolume(25);

    tv1.turnOn();
    tv1.turnOff();

    System.out.println(tv1);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 99);

    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv2);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv3 = new Television("LG");

    System.out.println(tv3);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv4 = new Television("Sony", 40);
    tv4.setDisplay(DisplayType.PLASMA);
    System.out.println(tv4);

    Television tv5 = new Television("LG", 15, DisplayType.CRT);
    System.out.println(tv5);
  }





}
