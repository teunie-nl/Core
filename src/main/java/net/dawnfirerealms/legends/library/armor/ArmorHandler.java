/*
This file is part of Legends.

    Legends is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Legends is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Legends.  If not, see <http://www.gnu.org/licenses/>.
*/
package net.dawnfirerealms.legends.library.armor;

import java.util.HashMap;

/**
 * @author B2OJustin
 */
public class ArmorHandler {
    // TODO These handler classes should probably be abstracted in one way or another
    public static HashMap<String, Armor> armorMap = new HashMap<>();

    public static void registerArmor(String name, Armor armor) {
        armorMap.put(name, armor);
    }

    public static Armor getArmor(String name) {
        return armorMap.get(name);
    }
}
