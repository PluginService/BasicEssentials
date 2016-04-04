package me.LiamPlugins;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.PluginManager;

public class ListenerClass
  implements Listener
{
  public ListenerClass(BasicEssentialsMain plugin)
  {
    plugin.getServer().getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onBlockPlace(BlockPlaceEvent onPlace)
  {
    Player player = onPlace.getPlayer();
    if (!player.hasPermission("basic.*")) {
      player.sendMessage(ChatColor.GRAY + "You do not have permission to place blocks!");
    }
    if (!player.hasPermission("basic.build")) {
      player.sendMessage(ChatColor.GRAY + "You do not have permission to place blocks!");
    }
    if ((!player.hasPermission("exp.*")) && 
      (!player.hasPermission("exp.build"))) {
      onPlace.setCancelled(true);
    }
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if ((cmd.getName().equalsIgnoreCase("exp")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      if (!player.hasPermission("basic.*")) {
        player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
      }
      if (!player.hasPermission("basic.exp")) {
        player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
      }
      if ((player.hasPermission("basic.*")) && 
        (player.hasPermission("basic.exp"))) {
        player.sendMessage("You have" + player.getTotalExperience() + " exp currently!");
      }
      return true;
    }
    if ((cmd.getName().equalsIgnoreCase("exptolevelup")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      if (!player.hasPermission("basic.*")) {
        player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
      }
      if (!player.hasPermission("basic.explevelup")) {
        player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
      }
      if ((player.hasPermission("basic.*")) && 
        (player.hasPermission("basic.explevelup"))) {
        player.sendMessage(ChatColor.GOLD + "You need" + ChatColor.RED + player.getExpToLevel() + ChatColor.GOLD + " to levelup to the next level!");
      }
      return true;
    }
    if ((cmd.getName().equalsIgnoreCase("expclear")) && ((sender instanceof Player)))
    {
      Player player = (Player)sender;
      if (!player.hasPermission("basic.*")) {
        player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
      }
      if (!player.hasPermission("basic.expclear")) {
        player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
      }
      if ((player.hasPermission("basic.*")) && 
        (player.hasPermission("basic.expclear"))) {
        player.setExp(0.0F);
      }
      player.sendMessage(ChatColor.RED + "Your EXP has been cleared!");
    }
    else
    {
      if ((cmd.getName().equalsIgnoreCase("expheal")) && ((sender instanceof Player)))
      {
        Player player = (Player)sender;
        if (!player.hasPermission("basic.*")) {
          player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
        }
        if (!player.hasPermission("basic.expheal")) {
          player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
        }
        if ((player.hasPermission("basic.*")) && 
          (player.hasPermission("basic.expheal"))) {
          player.setHealth(20.0D);
        }
        player.setExp(-1.0F);
        player.damage(1.0D);
        player.sendMessage(ChatColor.GREEN + "You have been healed!");
        return true;
      }
      if ((cmd.getName().equalsIgnoreCase("expfeed")) && ((sender instanceof Player)))
      {
        Player player = (Player)sender;
        if (!player.hasPermission("basic.*")) {
          player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
        }
        if (!player.hasPermission("basic.expfeed")) {
          player.sendMessage(ChatColor.GRAY + "You do not have permission to use this command!");
        }
        if ((player.hasPermission("basic.*")) && 
          (player.hasPermission("basic.expfeed"))) {
          player.setFoodLevel(20);
        }
        player.setExp(-1.0F);
        player.sendMessage(ChatColor.GREEN + "You feel relived!");
      }
    }
    return false;
  }
}
