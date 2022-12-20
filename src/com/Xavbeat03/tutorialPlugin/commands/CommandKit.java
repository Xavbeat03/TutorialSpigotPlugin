package com.Xavbeat03.tutorialPlugin.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor{

	//This method is called, when somebody uses our command
	/*onCommand method that gives the command sender 1 diamond and 20 bricks
	 * @param sender: is the entity who sent the command
	 * @param command: is the command being executed
	 * @param label: 
	 * @param args: a string array of the arguments for the command
	 * 
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			//Here we need to give items to our player
			
			//Create a new ItemStack (type: diamond)
			ItemStack diamond = new ItemStack(Material.DIAMOND);
			
			//Create a new ItemStack (type: brick)
			ItemStack bricks = new ItemStack(Material.BRICK, 20);
			
			//Give the player our items (comma-separated list of all ItemStack)
			player.getInventory().addItem(bricks, diamond);
		}
		
		//If the player (or console) uses our command correctly, we can return true
		return true;
	}
}
