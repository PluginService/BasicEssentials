package me.BasicEssentials.listener;

import me.BasicEssentials.BasicEssentials;
import me.BasicEssentials.player.Permission;
import me.BasicEssentials.player.Util;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class MainListener implements Listener {

    public MainListener() {
        Bukkit.getPluginManager().registerEvents(this, BasicEssentials.plugin);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        final Player player = event.getPlayer();

        if (!Permission.hasPermission(player, "basic.build")) {
            event.setCancelled(true);
            Util.msg(player, "You do not have enough permission to place");
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        final Player player = event.getPlayer();

        if (!Permission.hasPermission(player, "basic.build")) {
            event.setCancelled(true);
            Util.msg(player, "You do not have enough permission to break");
        }
    }
}
