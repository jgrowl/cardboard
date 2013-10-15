package us.spectr.cardboard.state;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import us.spectr.cardboard.Player;
import us.spectr.cardboard.condition.Condition;

import java.util.List;

/**
 * User: jonathan
 * Date: 9/20/12
 * Time: 11:45 PM
 */
public class StandardGameMachine implements ConditionsEndable {

    private List<Player> mPlayers;

    private int mCurrentPlayerIndex;

    @Inject
    private StandardGameMachine(@Assisted List<Player> players, @Assisted List<Condition> endingConditions) {
        if(players.size() < 1) {
            throw new IllegalArgumentException("Cannot create a game with no players.");
        }

        mPlayers = players;
    }

    public void endTurn() {
        changePlayer();
    }

    public void changePlayer() {
        mCurrentPlayerIndex = getNextPlayerIndex();
    }

    public int getNextPlayerIndex() {
        int nextPlayerIndex = mCurrentPlayerIndex + 1;
        return nextPlayerIndex >= mPlayers.size() ? 0 : nextPlayerIndex;
    }

    public boolean areEndingConditionsMet() {
        return false;
    }

    public void end() {
    }

}
