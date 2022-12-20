package com.Xavbeat03.tutorialPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.Xavbeat03.tutorialPlugin.commands.CommandKit;
import com.Xavbeat03.tutorialPlugin.listeners.SimpleListener;

public class TutorialSpigotPlugin extends JavaPlugin{
	//Fired when plugin is first enabled from the console
	@Override
	public void onEnable() {
		//Register our command "kit" (set an instance of your command class as executor)
		this.getCommand("kit").setExecutor(new CommandKit());
		//registers the event listener
		getServer().getPluginManager().registerEvents(new SimpleListener(), this);
	}
	
	//Fired when plugin is disabled
	@Override
	public void onDisable() {
	}
}
