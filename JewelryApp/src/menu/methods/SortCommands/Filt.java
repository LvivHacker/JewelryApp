package menu.methods.SortCommands;

import StonesContent.Necklace;
import StonesContent.Stonetypes.Stone;
import menu.Command;

public class Filt implements Command{
    @Override
    public void execute(Necklace content) {
        content.getNeckStones().setStones(Stone.filterStones(content.getNeckStones().getStones()));
    }
}


