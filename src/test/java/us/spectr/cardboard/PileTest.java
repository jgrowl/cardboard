package us.spectr.cardboard;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * User: jonathan
 * Date: 9/6/12
 * Time: 10:05 PM
 */
public class PileTest {

    @Test
    public void removeAllLeavesNothing() {
        PiecePile piecePile = TestHelper.getAnonymousPiecePile(3);
        assertFalse(piecePile.isEmpty());
        piecePile.removeAll();
        assertTrue(piecePile.isEmpty());
    }

}
