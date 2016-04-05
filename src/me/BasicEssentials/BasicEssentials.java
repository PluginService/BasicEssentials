package me.BasicEssentials;

import me.BasicEssentials.command.*;
import me.BasicEssentials.listener.MainListener;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicEssentials extends JavaPlugin {

    public static BasicEssentials plugin;

    @Override
    public void onLoad() {
        BasicEssentials.plugin = this;
    }

    @Override
    public void onEnable() {
        this.getCommand("exp").setExecutor(new Command_exp(plugin));
        this.getCommand("expclear").setExecutor(new Command_expclear(plugin));
        this.getCommand("expfeed").setExecutor(new Command_expfeed(plugin));
        this.getCommand("expheal").setExecutor(new Command_expheal(plugin));
        this.getCommand("exptolevelup").setExecutor(new Command_exptolevelup(plugin));
        new MainListener();
        //
        getLogger().info("BasicEssentials has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("BasicEssentials has been disabled");
    }
}
