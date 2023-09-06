package de.vepexlegit.deathcoordinates;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = DeathCoordinates.MODID, version = DeathCoordinates.VERSION)
public class DeathCoordinates {
    public static final String MODID = "deathcoordinates";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
