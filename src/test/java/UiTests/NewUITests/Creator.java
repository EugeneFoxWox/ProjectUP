package UiTests.NewUITests;

import java.util.ArrayList;
import java.util.List;

public class Creator {
    public static List<String> createStrings() {
        List<String> items = new ArrayList<String>();
        items.add("3277528936");
        items.add("2508922551");
        items.add("3276849220");
        items.add("2604865076");
        items.add("3405027544");
        return items;
    }

    public static List<AvitoItemObject> createObjects() {
        List<AvitoItemObject> items = new ArrayList<AvitoItemObject>();
        items.add(new AvitoItemObject("Новый Huawei D15 IPS i3-1115G4/SSD-256Gb/DDR4-8Gb", "38 999 ₽"));
        items.add(new AvitoItemObject("Ультрабук Honor 14\"/IPS/R5-5500u/8Gb/SSD 512Gb", "46 999 ₽"));
        items.add(new AvitoItemObject("Игровой Gigabyte 15.6 Core i5-12500H/RTX 4060/16Gb", "87 999 ₽"));
        items.add(new AvitoItemObject("Ноутбук Acer/15.6\"/IPS/Ryzen3/DDR4 8Gb/SSD/Vega", "31 999 ₽"));
        items.add(new AvitoItemObject("Ноутбук Huawei MateBook D15/Intel Core i5/DDR4-8Gb", "48 999 ₽"));

        return items;
    }
}
