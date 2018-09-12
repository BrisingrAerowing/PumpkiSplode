package de.ellpeck.pumpkisplode;

import net.minecraft.world.GameRules;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = PumpkiSplode.MOD_ID, name = PumpkiSplode.NAME, version = PumpkiSplode.VERSION, acceptableRemoteVersions = "*")
public class PumpkiSplode{

    public static final String MOD_ID = "pumpkisplode";
    public static final String NAME = "PumpkiSplode";
    public static final String VERSION = "@VERSION@";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
        event.getServer().getWorld(0).getGameRules().addGameRule("pumpkisplodeGriefing", "true", GameRules.ValueType.BOOLEAN_VALUE);
    }

}
