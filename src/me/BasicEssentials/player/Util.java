package me.BasicEssentials.player;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class Util {

    public static String color(String color) {
        return ChatColor.translateAlternateColorCodes('&', color);
    }

    public static void msg(CommandSender player, String message) {
        player.sendMessage(ChatColor.GRAY + message);
    }

    public static void bcastMsg(String msg, ChatColor color) {
        Bukkit.broadcastMessage(color + msg);
    }

    public static void bcastMsg(String msg) {
        Bukkit.broadcastMessage(msg);
    }
}
