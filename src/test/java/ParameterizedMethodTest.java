import JunitTutorial01.StringHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by ksza on 20.03.2017.
 */
@RunWith(Parameterized.class)
public class ParameterizedMethodTest {

    StringHelper stringHelper = new StringHelper();

    private String intput;
    private String expectedOutput;

    public ParameterizedMethodTest(String intput, String expectedOutput) {
        this.intput = intput;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutput = {
                {"AACD", "CD"},
                {"ACD", "CD"},
                {"CDEF" ,"CDEF" },
                {"AFG", "FG"},
                {"DFRGA","DFRGA"},
                {"AFRT", "FRTA"}
        };
        return Arrays.asList(expectedOutput);
    }
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Position() {
        // AACD => CD ACD =>CD CDEF => CDEF CDAA => CDAA
        assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(intput));
        /// given to parameters for method assertEquals(expected, actual)
    }

}
