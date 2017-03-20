import JunitTutorial01.StringHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by ksza on 20.03.2017.
 */
@RunWith(Parameterized.class)
public class ParametrizedBoolenMethodTest {

    StringHelper stringHelper = new StringHelper();

    private String input;

    public ParametrizedBoolenMethodTest(String input) {
        this.input = input;
    }

    @Parameterized.Parameters
    public static Collection<String> inputTest(){
        String[] expectedInput= {"ADBD", "ABAB", "AB", "A","CDED","CDCD"};
        return Arrays.asList(expectedInput);
    }
    @Test
    public void testAreFirstAndLastTwoCharakterdTheSame_BasicNegativeOutput(){
        assertFalse(stringHelper.areFirstAndLastTwoCharacterTheSame(input));
        
    }

    @Test
    public void testAreFirstAndLastTwoCharakterdTheSame_BasicPositiveOutput() {
        assertTrue(stringHelper.areFirstAndLastTwoCharacterTheSame(input));
    }

}
