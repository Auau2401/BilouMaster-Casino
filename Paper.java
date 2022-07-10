package de.auau2401.casinobiloumaster.Comands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Paper implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender p, Command c, String l, String[] a) {
        Player player = (Player)p;
        ItemStack paper = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = (paper.getItemMeta());
        meta.setDisplayName("Scheck");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("300€");
        lore.add("Rechtsklick zum Einlösen!");
        meta.setLore(lore);
        paper.setItemMeta(meta);
        player.getInventory().addItem(paper);
        String players = p.getName();
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "eco take " + players + " 300");
        return false;
    }
}
