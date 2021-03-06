/**
 * 
 */
package com.argo.bukkit.util;

import com.argo.bukkit.honeypot.Honeypot;

/**
 * @author andune
 *
 */
public class CustomBanHandler extends CommandBanHandler implements BanHandler {
    public CustomBanHandler() {
        super("Custom", (String) null, (String) null);
    }
    
    @Override
    public void init(Honeypot plugin) {
        super.init(plugin);
        super.banCmds = config.getCustomBanCommands();
        super.kickCmds = config.getCustomKickCommands();
    }
    
    /**
     * This handler is only enabled if explicitly set as such by the admin.
     */
    @Override
    public boolean isSupported() {
        return getHandlerName().equalsIgnoreCase(config.getBanSystem().toString());
    }
}
