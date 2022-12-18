package unikue3118.snowball;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SnowballCommand implements CommandExecutor {
    static Boolean SnowballExplode = false;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (SnowballExplode == false) {
            SnowballExplode = true;
            sender.sendMessage("ON!");
            return true;
        } else if (SnowballExplode == true) {
            SnowballExplode = false;
            sender.sendMessage("OFF!");
            return true;
        }
        return false;
    }
}
