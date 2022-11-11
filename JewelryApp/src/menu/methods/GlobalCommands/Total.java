package menu.methods.GlobalCommands;

import StonesContent.Necklace;
import StonesContent.Stonetypes.Stone;
import menu.Command;

public class Total implements Command {
    @Override
    public void execute(Necklace content) {
        content.getNeckStones().setTotalPrice(Stone.getTotalPrice(content.getNeckStones().getStones()));
        content.getNeckStones().setTotalWeight(Stone.getTotalWeight(content.getNeckStones().getStones()));
    }
}