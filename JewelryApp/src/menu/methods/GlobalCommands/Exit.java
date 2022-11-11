package menu.methods.GlobalCommands;

import StonesContent.Necklace;
import menu.Command;

public class Exit implements Command{
    @Override
    public void execute(Necklace content) throws Exception {
        System.out.println("До зустрічі! ;)");
        System.exit(0);
    }
}
