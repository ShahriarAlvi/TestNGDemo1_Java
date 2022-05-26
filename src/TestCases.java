import org.testng.annotations.Test;

public class TestCases {

    @Test
    void setup(){
        System.out.println("inside setup");
    }
    @Test
    void testSteps(){
        System.out.println("inside teststeps");
    }
    @Test
    void tearDown(){
        System.out.println("inside teardown");
    }

    //let's check hoise naki
}
