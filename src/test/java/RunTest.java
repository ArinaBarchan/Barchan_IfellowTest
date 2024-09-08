import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunTest {
//its RunTest origin
    @BeforeEach
    void beforeHotfix(){
        System.out.println("Всем приготовится к сканированию!");
        }

    @Test
    void testHotfix(){
        if(6%3==0){
            System.out.println("Всё ок!");
        }
    }

    @AfterEach
    void afterHotfix(){
        if(6%16==0){
            System.out.println("Всё ок!");}
        else
            System.out.println("Всё не ок!");
    }
    @BeforeEach
    public void before (){
        System.out.println("Всем приготовится!");
    }
    @Test
    public void test(){
        Assertions.assertTrue(3>2,"Ошибка проверки");

    }
    @AfterEach
    public void after(){
        Assertions.assertFalse(3>2,"Ошибка проверки");
    }
}
