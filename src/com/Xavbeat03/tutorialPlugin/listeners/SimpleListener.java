package com.Xavbeat03.tutorialPlugin.listeners;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SimpleListener implements Listener {
	
	//Event handler that listens for when a player joins and activates a method
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage(String.format("Welcome to the server, %s!", event.getPlayer().getName()));
	}
	

}
