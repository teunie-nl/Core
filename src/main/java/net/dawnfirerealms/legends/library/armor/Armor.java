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

import net.dawnfirerealms.legends.library.restriction.Restrictable;

/**
 * @author B2OJustin
 */
public class Armor implements Restrictable {
    public String name;
    public String[] description;

    public Armor() {
    }

    public Armor setName(String name) {
        this.name = name;
        return this;
    }

    public Armor setDescription(String[] description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public String[] getDescription() {
        return description;
    }
}
