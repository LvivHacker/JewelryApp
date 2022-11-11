package menu;

import StonesContent.Necklace;

public interface Command {
    void execute(Necklace content) throws Exception;
}