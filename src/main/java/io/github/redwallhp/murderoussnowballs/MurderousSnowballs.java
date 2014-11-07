package io.github.redwallhp.murderoussnowballs;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Snowball;


public final class MurderousSnowballs extends JavaPlugin implements Listener {
    
    
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }
    
    
    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent e) {
        if (!(e.getDamager() instanceof Snowball)) return;
        e.setDamage(2); //deal one heart of damage
    }
    
    
}
