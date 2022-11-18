package cplug.cplug.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Plugins implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player targetPlayer = Bukkit.getPlayer(args[0]);
        Player sendingPlayer = (Player) sender;

        targetPlayer.sendMessage("Plugins(3): §aFully§r, §aCustom§r, §aPlugins");
        return false;
    }
}
