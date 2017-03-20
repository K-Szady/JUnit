import org.junit.Test;
import JunitTutorial01.StringHelper;

import static junit.framework.TestCase.*;

/**
 * Created by ksza on 20.03.2017.
 */
public class StringHelperTest {
    StringHelper stringHelper = new StringHelper();
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Position() {
        // AACD => CD ACD =>CD CDEF => CDEF CDAA => CDAA
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
        /// given to parameters for method assertEquals(expected, actual)
    }

    @Test
    public void testTruncateAInFirst2Positions_AimFirstPosition() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }
    @Test
    public void testTruncateAInFirst2Pssitions_AimNoAInString(){
        assertEquals("CDEF",stringHelper.truncateAInFirst2Positions("CDEF"));
    }
    @Test
    public void testTruncateAInFirst2Positions_AimLast2Position(){
        assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));
    }
    // ABXD => false; ABAB =>true; AB => true; A => false;
    @Test
    public void testAreFirstAndLastTwoCharakterdTheSame_BasicNegativeOutput(){
        assertFalse(stringHelper.areFirstAndLastTwoCharacterTheSame("ABXD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharakterdTheSame_BasicPositiveOutput() {
        assertTrue(stringHelper.areFirstAndLastTwoCharacterTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharakterdTheSame_Aim2Characters(){
        assertTrue(stringHelper.areFirstAndLastTwoCharacterTheSame("AB"));
    }

    @Test
    public void testtestAreFirstAndLastTwoCharakterdTheSame_AimOneCharacter(){
        assertFalse(stringHelper.areFirstAndLastTwoCharacterTheSame("A"));
    }
}
