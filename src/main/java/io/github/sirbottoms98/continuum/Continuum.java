package io.github.sirbottoms98.continuum;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// Identifies this class as the entry point for the Continuum mod.
@Mod(Continuum.MODID)
public class Continuum {

    // The unique identifier for Continuum, shared across the mod.
    public static final String MODID = "continuum";

    // Used to record information and errors in Minecraft's logs.
    public static final Logger LOGGER = LogUtils.getLogger();

    // NeoForge calls this constructor when loading Continuum.
    public Continuum(IEventBus modEventBus) {
        LOGGER.info("Continuum initialized");
    }
}