package me.xflakesid.lumiaexpressions.handlers;

import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler {
	static ChatColor darkRed = ChatColor.DARK_RED;
	static ChatColor darkBlue = ChatColor.DARK_BLUE;
	static ChatColor darkGray = ChatColor.DARK_GRAY;
	static ChatColor darkAqua = ChatColor.DARK_AQUA;
	static ChatColor darkGreen = ChatColor.DARK_GREEN;
	static ChatColor purple = ChatColor.DARK_PURPLE;
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

	static Player p;

	public static void hugCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		p = (Player) sender;
		if (lbl.equalsIgnoreCase("hug")) {
			if (args.length == 0) {
				bC(p, frMsg + p.getDisplayName() + pink + " wants a hug!");
			} else if (args.length == 1) {
				if (p.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = p.getServer().getPlayer(args[0]);
					p.getServer().broadcastMessage(frMsg + p.getDisplayName() + pink + " gave " + reset + targetplayer.getDisplayName() + pink + " a hug!");
				} else {
					p.sendMessage(frMsg + red + "Error: Player not found!");
				}
			}
		}
	}

	public static void cuddleCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		p = (Player) sender;
		if (lbl.equalsIgnoreCase("cuddle")) {
			if (args.length == 0) {
				bC(p, frMsg + p.getDisplayName() + purple + " wants to cuddle!");
			} else if (args.length == 1) {
				if (p.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = p.getServer().getPlayer(args[0]);
					p.getServer().broadcastMessage(frMsg + p.getDisplayName() + purple + " cuddled with " + reset + targetplayer.getDisplayName() + reset);
				} else {
					p.sendMessage(frMsg + red + "Error: Player not found!");
				}
			}
		}
	}

	public static void trollCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		p = (Player) sender;

		if (lbl.equalsIgnoreCase("troll")) {
			if (args.length == 0) {
				p.sendMessage(frMsg + red + "you can only troll a player!");
			} else if (args.length == 1) {
				if (p.getServer().getPlayer(args[0]) != null) {
					Player tp = p.getServer().getPlayer(args[0]);
					bC(p, frMsg + p.getDisplayName() + green + " trolled " + reset + tp.getDisplayName());
				} else {
					p.sendMessage(frMsg + red + "Error: Player not found!");
				}
			}
		}
	}

	public static void runoverCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		p = (Player) sender;

		if (lbl.equalsIgnoreCase("troll")) {
			if (args.length == 0) {
				p.sendMessage(frMsg + red + "you can only run over a player!");
			} else if (args.length == 1) {
				if (p.getServer().getPlayer(args[0]) != null) {
					Player tp = p.getServer().getPlayer(args[0]);
					bC(p, frMsg + p.getDisplayName() + darkRed + " ran over " + reset + tp.getDisplayName());
				} else {
					p.sendMessage(frMsg + red + "Error: Player not found!");
				}
			}
		}
	}

	public static void buttspankCommand(CommandSender sender, Command cmd, String lbl, String[] args) {
		p = (Player) sender;
		if(lbl.equalsIgnoreCase("Buttspank")){
			if(args.length == 0){
				p.sendMessage(frMsg + red + "you can only buttspank a player!");
			}else if(args.length == 1){
				if(p.getServer().getPlayer(args[0]) != null){
					Player tp = p.getServer().getPlayer(args[0]);
					if(p.getServer().getPlayer(args[0]) == p ){
						p.sendMessage(frMsg + red + "you can not use this expression on your self!");
					}else{
						bC(p, p.getDisplayName() + darkRed + " buttspanked " + reset + tp.getDisplayName());
					}
				}
				
			}
		}
	}

	public static void registerCommands(CommandSender sender, Command cmd, String lbl, String[] args) {
		hugCommand(sender, cmd, lbl, args);
		cuddleCommand(sender, cmd, lbl, args);
	}

	public static void bC(Player p, String s) {
		p.getServer().broadcastMessage(s);
	}

	public static OfflinePlayer gP(Player p, String args) {
		return p.getServer().getOfflinePlayer(args);
	}
}
