import org.junit.jupiter.api.*;

public class RunTest {
//its RunTest origin
    @BeforeEach
    void before(){
        System.out.println("Всем приготовится к сканированию!");
        }

    @Test
    void test(){
        if(6%3==0){
            System.out.println("Всё ок!");
        }
    }

    @AfterEach
    void after (){
        if(6%16==0){
            System.out.println("Всё ок!");}
        else
            System.out.println("Всё не ок!");
    }
}
