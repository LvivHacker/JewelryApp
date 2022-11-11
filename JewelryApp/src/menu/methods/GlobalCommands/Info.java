package menu.methods.GlobalCommands;

import StonesContent.Necklace;
import StonesContent.Stonetypes.Stone;
import menu.Command;

public class Info implements Command {
    @Override
    public void execute(Necklace content) {
        System.out.print("Назву намиста-: ");
        System.out.println(content.getNecklaceName());
        Stone.listOfStones(content.getNeckStones().getStones());
    }
}
