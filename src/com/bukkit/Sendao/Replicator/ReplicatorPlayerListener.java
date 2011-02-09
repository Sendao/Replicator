package com.bukkit.Sendao.Replicator;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Handle events for all Player related events
 * @author Sendao
 */
public class ReplicatorPlayerListener extends PlayerListener {
    private final Replicator plugin;

    public ReplicatorPlayerListener(Replicator instance) {
        plugin = instance;
    }

    //Insert Player related code here
}

