package com.Xavbeat03.tutorialPlugin.listeners;

import org.bukkit.event.Listener;

public class SimpleListener implements Listener {
	
	// Activates when plugin is enabled
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new MyListener(), this);
	}
}
