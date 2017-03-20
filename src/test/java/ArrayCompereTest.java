import org.junit.*;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by ksza on 20.03.2017.
 */
public class ArrayCompereTest {
    @Test
    public void test1(){
        int[] numbers = {13,2,5,7,1};
        int[] exception = {1, 2, 5, 7, 13};
        Arrays.sort(numbers);
        assertArrayEquals(exception,numbers);
    }

    @Test(expected = NullPointerException.class)
    public void test2(){
        int[] numbers = null;
        int[] exception = {1, 2, 5, 7, 13};
        Arrays.sort(numbers);

    }

    @Test(timeout = 100)
    public void testArraySort_Performance(){
        int[] arrays = {12,14,5,7};
        for (int i =0; i<100000; i++){
            arrays[0] = i;
            Arrays.sort(arrays);
        }
    }
}
