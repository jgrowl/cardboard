package us.spectr.cardboard;

import org.apache.commons.lang.RandomStringUtils;
import org.jmock.Mockery;
import us.spectr.cardboard.state.GameMachine;

import java.util.ArrayList;
import java.util.List;

/**
 * User: jonathan
 * Date: 9/6/12
 * Time: 10:20 PM
 */
public class TestHelper {

    private static Mockery sContext = new Mockery();

    public static Piece getAnonymousPiece() {
        return sContext.mock(Piece.class, getAnonymousPrefixedString("piece"));
    }

    public static List<Piece> getAnonymousPieces(int numberOfPieces) {
        List<Piece> pieces = new ArrayList<Piece>(numberOfPieces);
        while(numberOfPieces > 0) {
            pieces.add(getAnonymousPiece());
            numberOfPieces--;
        }

        return pieces;
    }

    public static PiecePile getAnonymousPiecePile(int numberOfPieces) {
        return new PiecePile(getAnonymousPieces(numberOfPieces));
    }

    public static String getAnonymousPrefixedString(String prefix) {
        return prefix + RandomStringUtils.randomAlphanumeric(10);
    }

    public static GameMachine getAnonymousTurnBasedGameMachine() {
        return sContext.mock(GameMachine.class);
    }

}
