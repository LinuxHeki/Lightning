package me.linuxheki.lightning;

import me.linuxheki.lightning.events.Lightning;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Lightning(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
