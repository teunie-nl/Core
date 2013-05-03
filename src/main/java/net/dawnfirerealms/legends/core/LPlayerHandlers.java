package net.dawnfirerealms.legends.core;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class LPlayerHandlers {

  private HashMap<String, LegendsPlayer> data = new HashMap<String, LegendsPlayer>();

	public LegendsPlayer getPlayer(Player player){
		return data.get(player.getName());
	}
	
	public void setPlayer(Player player, LegendsPlayer lPlayer){
		data.put(player.getName(), lPlayer);
	}
	
}
