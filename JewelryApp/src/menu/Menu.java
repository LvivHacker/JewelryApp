package menu;

import StonesContent.Necklace;
import filework.FileCommands.Reader;
import filework.FileCommands.Writer;
import menu.methods.AddingMethods.*;
import menu.methods.GlobalCommands.*;
import menu.methods.SortCommands.*;

import java.util.*;

public class Menu {
    private Map<String, Command> menuItems;
    public Menu() {
        menuItems = new LinkedHashMap<>();
        menuItems.put("NEW", new Create());

        menuItems.put("ADD", new Add());
        menuItems.put("DEL", new Del());
        menuItems.put("TOT", new Total());

        menuItems.put("FLTR", new Filt());
        menuItems.put("SORT", new Sort());

        menuItems.put("WTF", new Writer());
        menuItems.put("RFF", new Reader());

        menuItems.put("INFO", new Info());
        menuItems.put("EXIT", new Exit());
    }
    public void execute(String command, Necklace content) throws Exception {
        Command menuItem = menuItems.get(command);
        if(menuItem == null){
            System.out.println("НЕВІРНІ ДАННІ!");
            return;
        }

        if(Objects.equals(content.getNecklaceName(), "") && !Objects.equals(command, "NEW")){
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n\"Ви ще не створили намисто, введіть ім'я свого намиста: ");
            content.setNecklaceName(scanner.nextLine());
            return;
        }

        menuItems.get(command).execute(content);
    }

    public Set<String> getAllCommands(){
        return menuItems.keySet();
    }
}
