package me.xflakesid.lumiaexpressions.handlers;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler {
	static ChatColor darkRed = ChatColor.DARK_RED;
	static ChatColor darkBlue = ChatColor.DARK_BLUE;
	static ChatColor darkGray = ChatColor.DARK_GRAY;
	static ChatColor darkAqua = ChatColor.DARK_AQUA;
	static ChatColor darkGreen = ChatColor.DARK_GREEN;
	static ChatColor darkPurple = ChatColor.DARK_PURPLE;
	static ChatColor red = ChatColor.RED;
	static ChatColor blue = ChatColor.BLUE;
	static ChatColor black = ChatColor.BLACK;
	static ChatColor gray = ChatColor.GRAY;
	static ChatColor gold = ChatColor.GOLD;
	static ChatColor green = ChatColor.GREEN;
	static ChatColor aqua = ChatColor.AQUA;
	static ChatColor pink = ChatColor.LIGHT_PURPLE;
	static ChatColor yellow = ChatColor.YELLOW;
	static ChatColor reset = ChatColor.RESET;
	static ChatColor bold = ChatColor.BOLD;
	static ChatColor white = ChatColor.WHITE;
	static public String frMsg = white + "[" + green + "Lumia" + white + "]" + reset;

	static Player player;

	public static void hugCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		player = (Player) sender;
		if (lbl.equalsIgnoreCase("hug")) {
			if (args.length == 0) {
				player.getServer().broadcastMessage(frMsg + player.getDisplayName() + " wants a hug..!");
			} else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(gold+ player.getDisplayName() + pink + " Hugs " + reset + targetplayer.getDisplayName() + reset);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
	}

	public static void registerCommands(CommandSender sender, Command cmd, String lbl, String[] args) {
		hugCommand(sender,cmd,lbl,args);
	}
}
