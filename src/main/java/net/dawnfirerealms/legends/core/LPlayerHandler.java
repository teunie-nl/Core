package net.dawnfirerealms.legends.core;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class LPlayerHandler {

  private HashMap<String, LPlayer> data = new HashMap<String, LPlayer>();

	public LegendsPlayer getPlayer(Player player){
		return data.get(player.getName());
	}
	
	public void setPlayer(Player player, LPlayer lPlayer){
		data.put(player.getName(), lPlayer);
	}
	
}
