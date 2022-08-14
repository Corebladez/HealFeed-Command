package Core.FeedHeal;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;

                player.sendMessage(ChatColor.GREEN + "Your health has been restored to full!");
                player.setHealth(20.0d);
                return true;
            }
    }
