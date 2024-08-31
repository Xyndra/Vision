package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.NotImplementedException;

@Mod(Constants.MOD_ID)
public class VisionMod {
    
    public VisionMod() {
        throw new NotImplementedException("There is no forge impl yet");

        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        CommonClass.init();
        
    }
}