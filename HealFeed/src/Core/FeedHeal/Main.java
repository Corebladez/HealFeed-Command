package Core.FeedHeal;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        System.out.println("Hello");

        getCommand("heal").setExecutor(new Heal());
        getCommand("feed").setExecutor(new Feed());
    }

    @Override
    public void onDisable() {
        System.out.println("Shutting Down");
    }

    @EventHandler
    public void playerFood(FoodLevelChangeEvent event) {
        Entity e = event.getEntity();
        if (e instanceof Player) {
            ((Player) e).setFoodLevel(20);
        }

    }
}
