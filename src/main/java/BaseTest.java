import org.testng.annotations.*;
import steps.Steps;

public class BaseTest implements Steps {
    @BeforeSuite
    public static void beforeSuite() {
        System.out.print("//Suite Start//");
    }

    @AfterSuite
    public static void afterSuite() {
        System.out.print("//Suite end//");
    }

    @BeforeTest
    public static void beforeT() {
        System.out.println();
        System.out.print("Start Testing Class: ");
    }

    @AfterTest
    public static void afterT() {
        System.out.println("Tests Complete!");
    }


}
