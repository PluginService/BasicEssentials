package me.BasicEssentials.command;

import me.BasicEssentials.BasicEssentials;
import me.BasicEssentials.player.Permission;
import me.BasicEssentials.player.Util;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_expclear implements CommandExecutor {
    
    private final BasicEssentials plugin;
    
    public Command_expclear(BasicEssentials plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Util.msg(sender, "You must be in-game to use this command");
            return true;
        }
        
        if (!Permission.hasPermission(sender, "basic.exp.clear")) {
            Util.msg(sender, ChatColor.RED + "You do not have enough permission to use this command");
            return true;
        }
        
        Player player = (Player) sender;
        player.setExp(0f);
        Util.msg(player, ChatColor.GREEN + "Successfully cleared");
        return true;
    }
}