package us.spectr.cardboard.state;

import us.spectr.cardboard.condition.Condition;

import java.util.List;

/**
 * User: jonathan
 * Date: 9/24/12
 * Time: 9:11 PM
 */
public abstract class AbstractConditionsEndable implements ConditionsEndable {

    private List<Condition> mConditions;

    public boolean areEndingConditionsMet() {
        for(Condition condition : mConditions) {
            if(!condition.isSatisfied()) {
                return false;
            }
        }

        return true;
    }

}
