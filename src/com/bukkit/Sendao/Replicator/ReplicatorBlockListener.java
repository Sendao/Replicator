package com.bukkit.Sendao.Replicator;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * Replicator block listener
 * @author Sendao
 */
public class ReplicatorBlockListener extends BlockListener {
    private final Replicator plugin;

    public ReplicatorBlockListener(final Replicator plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
}
