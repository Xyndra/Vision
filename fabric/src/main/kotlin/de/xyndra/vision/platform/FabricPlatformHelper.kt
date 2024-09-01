package de.xyndra.vision.platform

import de.xyndra.vision.platform.services.IPlatformHelper
import net.fabricmc.loader.api.FabricLoader

class FabricPlatformHelper : IPlatformHelper {
    override val platformName: String = "Fabric"

    override fun isModLoaded(modId: String): Boolean {
        return FabricLoader.getInstance().isModLoaded(modId)
    }

    override val isDevelopmentEnvironment: Boolean = FabricLoader.getInstance().isDevelopmentEnvironment
}
