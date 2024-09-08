import org.junit.Before;
import org.junit.jupiter.api.*;

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
}
