package cplug.cplug.handlers;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventsClass implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();

        if (action.equals(Action.LEFT_CLICK_BLOCK)) {
            assert block != null;
            if (block.getType().equals(Material.DANDELION)) {
                if (player.getHealth() != 20) {
                    player.setHealth(player.getHealth() + 1);
                    player.sendMessage(ChatColor.DARK_GRAY + "You have been healed");
                } else {
                    player.sendMessage(ChatColor.GOLD + "You have full health");
                }
            } else {
                player.sendMessage(
                        ChatColor.RED + "You clicked: " + ChatColor.RED + block.getType().toString().toUpperCase());
            }
        }
    }
}