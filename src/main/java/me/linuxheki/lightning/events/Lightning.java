package me.linuxheki.lightning.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;

public class LightningStrike implements Listener {
    @EventHandler
    public static void onStrike(LightningStrikeEvent event) {
        if ((event.isCancelled()) || (event.getCause().name() == "TRIDENT")) {return;}

        LightningStrike lightning = event.getLightning();

    }
}
