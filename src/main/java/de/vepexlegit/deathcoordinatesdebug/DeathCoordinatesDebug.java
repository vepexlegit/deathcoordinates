package de.vepexlegit.deathcoordinatesdebug;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = DeathCoordinatesDebug.MODID, version = DeathCoordinatesDebug.VERSION)
public class DeathCoordinatesDebug {
    public static final String MODID = "deathcoordinatesdebug";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
