package Hlam;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Epic("Азы")
@Feature("Считалки")
public class Classtwo {

    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static ArrayList<String> letters = new ArrayList<String>();
    static Map<Integer,String> dictionary = new HashMap<Integer,String>();


    @Test
    public void Listnum(){
        Addnum();
        Search();
        Delnum();
    }


    @Test
    public void Listletter(){
        Addlet();
        Serch();
        Dellet();
    }


    @Test
    public void List1(){
        Addit();
        Serchit();
        Delit();
    }

    @Step("Добавление")
    public static void Addnum(){
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Assert.assertEquals(numbers.size(), 3);
    }
    @Step("Поиск")
    public  static void Search(){
        Assert.assertEquals(numbers.get(0), (Integer) 1);
    }
    @Step("Удаление")
    public static void Delnum(){
        numbers.remove(0);
        Assert.assertEquals(numbers.size(), 2);
    }

    @Step("Добавление")
    public static void Addlet(){
        letters.add("f");
        letters.add("y");
        letters.add("a");
        Assert.assertEquals(letters.size(), 3);
    }
    @Step("Поиск")
    public  static void Serch(){
        Assert.assertEquals(letters.get(0), "f");
    }

    @Step("Удаление")
    public static void Dellet(){
        letters.remove(0);
        letters.remove(1);
        Assert.assertEquals(letters.size(), 1);
    }

    @Step("Добавление")
    public static void Addit(){
        dictionary.put(0, "Нулёвка");
        dictionary.put(1, "Первый");
        dictionary.put(2, "Двойка");
        Assert.assertEquals(dictionary.size(), 3);
    }
    @Step("Поиск")
    public  static void Serchit(){
        Assert.assertEquals(dictionary.get(0), "Нулёвка");
    }

    @Step("Удаление")
    public static void Delit(){
        dictionary.remove(1);
        Assert.assertEquals(dictionary.size(), 2);
    }



}
