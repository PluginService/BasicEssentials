package me.BasicEssentials.player;

import org.bukkit.command.CommandSender;

public class Permission {

    public static boolean hasPermission(CommandSender player, String permission) {
        return player.hasPermission(permission);
    }

    // to be modify (Simple permission system)
}
