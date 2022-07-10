package de.auau2401.casinobiloumaster;

import de.auau2401.casinobiloumaster.Comands.Paper;
import de.auau2401.casinobiloumaster.Listeners.clickListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Casino extends JavaPlugin {
    private static Casino instance;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new clickListener(), this);
        Bukkit.getConsoleSender().sendMessage("§b----------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§aDas Casino Plugin wurde erfolgreich geladen und aktiviert!");
        Bukkit.getConsoleSender().sendMessage("§aVersion: 0.1 BETA");
        Bukkit.getConsoleSender().sendMessage("§b----------------------------------------------------------");
        getCommand("testpaper").setExecutor(new Paper());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§b----------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§cDas Casino Plugin wurde erfolgreich deaktiviert!");
        Bukkit.getConsoleSender().sendMessage("§b----------------------------------------------------------");
    }

    private void registerCommands() {

    }
}
