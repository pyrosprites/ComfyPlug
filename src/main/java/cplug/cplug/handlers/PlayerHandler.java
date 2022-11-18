package cplug.cplug.handlers;

import cplug.cplug.Cplug;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Collections;


public class PlayerHandler extends JavaPlugin implements Listener {
    public PlayerHandler(Cplug plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
        }




        @Override
        public void onEnable() {
            getServer().getPluginManager().registerEvents(this, this);
        }

        @EventHandler
        public void PlayerJoin(PlayerLoginEvent event) {
            Player p = event.getPlayer();
            if (!p.hasPlayedBefore()) {
                ItemStack selector = new ItemStack(Material.KNOWLEDGE_BOOK, 1);
                ItemMeta meta = selector.getItemMeta();
                ArrayList<String> lore = new ArrayList<String>();
                lore.add("§7Right Click to §8view contents");
                assert meta != null;
                meta.setLore(lore);
                meta.setDisplayName("Guide");
                selector.setItemMeta(meta);
                p.getInventory().setItem(9, selector);
            }
    }
}

