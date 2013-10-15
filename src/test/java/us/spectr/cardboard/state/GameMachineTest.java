package us.spectr.cardboard.state;

import org.junit.Test;
import us.spectr.cardboard.TestHelper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * User: jonathan
 * Date: 9/6/12
 * Time: 10:05 PM
 */
public class GameMachineTest {

    @Test
    public void test() {
        GameMachine gameMachine = TestHelper.getAnonymousTurnBasedGameMachine();
    }

}
