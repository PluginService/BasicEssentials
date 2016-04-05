package me.LiamPlugins;

import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicEssentialsMain
  extends JavaPlugin
{
  public Permission playerPermission = new Permission("basic.*");
  public Permission playerPermission2 = new Permission("basic.exp");
  public Permission playerPermission3 = new Permission("basic.explevelup");
  public Permission playerPermission4 = new Permission("basic.expclear");
  public Permission playerPermission5 = new Permission("basic.expheal");
  public Permission playerPermission6 = new Permission("basic.expfeed");
  public Permission playerPermission7 = new Permission("basic.build");
  
  public void onEnable()
  {
    getLogger().info("BasicEssentials has been activated!");
    new ListenerClass(this);
    
    PluginManager pm = getServer().getPluginManager();
  }
  
  public void onDisable()
  {
    getLogger().info("BasicEssentials has been de-activated!");
  }
}
