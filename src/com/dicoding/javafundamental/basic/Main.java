package com.dicoding.javafundamental.basic;
import com.dicoding.javafundamental.basic.kendaraan.*;

import com.dicoding.javafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("besok =" + tomorrow);

        String dicoding = "dicoding";
        String result = dicoding.substring(0,6);
        System.out.println(result);
    }
}
