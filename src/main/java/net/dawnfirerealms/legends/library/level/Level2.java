package net.dawnfirerealms.legends.library.level;

import net.dawnfirerealms.legends.library.restriction.Restrictions;
import net.dawnfirerealms.legends.library.skill.Skill;

import org.bukkit.entity.Player;

public interface LevelUser {
   public Restrictions<Level> getLevelRestrictions();
	 public void addLevel(Player player, int level, Skill skill);
		
		public void takeLevel(Player player, int level, Skill skill);
		
		public void setLevel(Player player, int level, Skill skill);
		
		public void giveExp(Player player, int exp, Skill skill);
		
		public int getExp(Player player, Skill skill);
}
