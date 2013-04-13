package com.sirolf2009.necroapi;

import java.util.HashMap;

/**
 * The registry class to register necro mobs
 * 
 * @author sirolf2009
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class NecroEntityRegistry {

    /**
     * Call this to register your necro mob
     * 
     * @param the
     *            mob to be registered
     */
    public static void RegisterEntity(NecroEntityBase data) {
        if (data.isNecromancyInstalled && !registeredEntities.containsKey(data.mobName)) {
            registeredEntities.put(data.mobName, data);
        }
    }

    /**
     * The map containing the registered mobs
     */
    public static HashMap<String, NecroEntityBase> registeredEntities = new HashMap<String, NecroEntityBase>();
}
