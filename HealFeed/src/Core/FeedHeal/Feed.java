package Core.FeedHeal;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;

        player.sendMessage(ChatColor.GREEN + "Your healthbar has been restored to full!");
        player.setFoodLevel(20);
        return true;
    }

}

