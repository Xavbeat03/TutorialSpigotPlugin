package com.Xavbeat03.tutorialPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.Xavbeat03.tutorialPlugin.commands.CommandKit;

public class TutorialSpigotPlugin extends JavaPlugin{
	//Fired when plugin is first enabled from the console
	@Override
	public void onEnable() {
		//Register our command "kit" (set an instance of your command class as executor)
		this.getCommand("kit").setExecutor(new CommandKit());
	}
	
	//Fired when plugin is disabled
	@Override
	public void onDisable() {
	}
}
