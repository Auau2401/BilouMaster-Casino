package de.auau2401.casinobiloumaster.Listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Objects;

public class clickListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        Action a = e.getAction();
        Block b = e.getClickedBlock();
        Player p = e.getPlayer();

        if (a.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (p.getInventory().getItemInMainHand().equals(new ItemStack(Material.PAPER))) {
                if (1 == 1) {
                    p.sendMessage("Test");
                    p.getInventory().removeItem(p.getInventory().getItemInMainHand());
                } else
                    return;
            }
        }
        if (a.equals(Action.RIGHT_CLICK_AIR)) {
            if (p.getInventory().getItemInMainHand().equals(new ItemStack(Material.PAPER))) {
                if (p.getInventory().getItemInMainHand().getItemMeta().getLore().equals("200€")) {
                    p.sendMessage("Test");
                }
            }
        }
    }
}
