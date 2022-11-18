package cplug.cplug;

import cplug.cplug.commands.Plugins;
import cplug.cplug.handlers.CMDHandler;
import cplug.cplug.handlers.PlayerHandler;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cplug extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello World, lets get comfy");
        new CMDHandler(this);
        new PlayerHandler(this);
        getCommand("plugins").setExecutor(new Plugins());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Shutting down");
    }
}
