import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.*;
@Epic("Азы")
@Feature("Серьезная математика")
public class Classone {


    @Test(testName="Сложение")
    public void Plus(){
        checkSum(2, 5, 7);
        checkSum(3, 5, 8);
        checkSum(2, 9, 11);

    }


    @Test(testName="Вычитание")
    public void Minus(){
        checkMin(11, 9, 2);
        checkMin(8, 9, -1);
        checkMin(10, 9, 1);
    }


    @Test(testName="Умножение")
    public void Umn(){
        checkUmn(1, 2, 2);
        checkUmn(5, 2, 10);
        checkUmn(7, 4, 28);
    }

    @Step("Проверка")
    public static void checkSum(int num1, int num2, int expectedSum) {
        Assert.assertTrue(num1 + num2 == expectedSum, "Сумма чисел не соответствует ожидаемому значению");
    }

    @Step("Проверка")
    public static void checkMin(int num1, int num2, int expectedSum) {
        Assert.assertTrue(num1 - num2 == expectedSum, "Разница чисел не соответствует ожидаемому значению");
    }

    @Step("Проверка")
    public static void checkUmn(int num1, int num2, int expectedSum) {
        Assert.assertTrue(num1 * num2 == expectedSum, "Произведение чисел не соответствует ожидаемому значению");
    }


}
