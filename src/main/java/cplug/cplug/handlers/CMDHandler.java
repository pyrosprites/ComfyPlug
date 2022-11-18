package cplug.cplug.handlers;

import cplug.cplug.Cplug;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class CMDHandler implements Listener {

    // Permission Node
    // cplug.cmdplace.default
    // cplug.cmdplace.chain
    // cplug.cmdplace.repeating

    public CMDHandler(Cplug plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onCmdPlace_Low(BlockPlaceEvent event) {
        Bukkit.getLogger().info("!!! A Command Block has been placed");
        if (event.getPlayer().hasPermission("cplug.cmdplace.default")) {
            if (event.getBlock().getType() == Material.COMMAND_BLOCK) {
                event.getBlock().setType(Material.ROOTED_DIRT);

                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.sendMessage("§c§lHEY! §7You are not permitted to use §8§oCommand Blocks");
                }
            }
            return;
        }
        if (event.getPlayer().hasPermission("cplug.cmdplace.chain")) {
            if (event.getBlock().getType() == Material.CHAIN_COMMAND_BLOCK) {
                event.getBlock().setType(Material.ROOTED_DIRT);

                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.sendMessage("§c§lHEY! §7You are not permitted to use §8§oCommand Blocks");
                }
            }
            return;
        }
        if (event.getPlayer().hasPermission("cplug.cmdplace.repeating")) {
            if (event.getBlock().getType() == Material.REPEATING_COMMAND_BLOCK) {
                event.getBlock().setType(Material.ROOTED_DIRT);

                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.sendMessage("§c§lHEY! §7You are not permitted to use §8§oCommand Blocks");
                }
            }
            return;
        }
    }
}
