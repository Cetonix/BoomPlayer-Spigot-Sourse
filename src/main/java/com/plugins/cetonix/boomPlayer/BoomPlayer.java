package com.plugins.cetonix.boomPlayer;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class BoomPlayer extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        Bukkit.getServer().getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {

        // Plugin shutdown logic

    }

    public static int getRandom() {
        return (int) (Math.random() * 3) + 1;
    }

    public static void boomPlayer(Player player) {
        int result = getRandom();
        if (result == 1) {
            player.setHealth(0.0);
            player.sendMessage("Вы погибли, случайным образом! <^_^>");
        }
        //if (result == 1) player.sendMessage("Вам только что повезло! Вы чуть не умерли ._.");
    }

    @EventHandler
    public void onPlayerConnect(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }

    @EventHandler
    public void onPlayerText(PlayerChatEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }

    @EventHandler
    public void onPlayerEnterBed(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }

    @EventHandler
    public void onPlayerLeaveBed(PlayerBedLeaveEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }

    @EventHandler
    public void onPlayerGamemodeChange(PlayerGameModeChangeEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }

    @EventHandler
    public void onPlayerChangeWorld(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();
        boomPlayer(player);
    }
}
