package net.dawnfirerealms.legends.library.level;

import net.dawnfirerealms.legends.library.restriction.Restrictable;
import net.dawnfirerealms.legends.library.skill.Skill;

import org.bukkit.entity.Player;

public class Level implements Restrictable{
	
	public void addLevel(Player player, int level, Skill skill){
		return;
	}
	
	public void takeLevel(Player player, int level, Skill skill){
		return;
	}
	
	public void setLevel(Player player, int level, Skill skill){
		return;
	}
	
	public void giveExp(Player player, int exp, Skill skill){
		return;
	}
	
	public int getExp(Player player, Skill skill){
		return 0;
	}
}
