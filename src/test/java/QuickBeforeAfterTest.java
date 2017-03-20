import org.junit.*;

/**
 * Created by ksza on 20.03.2017.
 */
public class QuickBeforeAfterTest {

    @BeforeClass
    public static void setupBeforeClass(){
        System.out.println("Before Class");
    }

    @Before
    public void setupBefore(){
        System.out.println("Before Test");
    }

    @Test
    public void test1(){
        System.out.println("test 1 running");
    }

    @Test
    public void test2(){
        System.out.println("test 2 running");
    }

    @After
    public void teardownAfter(){
        System.out.println("After test");
    }

    @AfterClass
    public static void teardownAfterClass(){
        System.out.println("After Class");
    }
}
