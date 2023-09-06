package de.vepexlegit.deathcoordinates.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.util.ChatComponentText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityPlayerSP.class)
public class MixinEntityPlayerSP {

    @Shadow private Minecraft mc = Minecraft.getMinecraft();

    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void onUpdate(final CallbackInfo ci) {
        if (mc.thePlayer.getHealth() < 1.0f && mc.currentScreen instanceof GuiGameOver) {
            int x = mc.thePlayer.getPosition().getX();
            int y = mc.thePlayer.getPosition().getY();
            int z = mc.thePlayer.getPosition().getZ();
            if (mc.thePlayer.deathTime < 1) {
                mc.thePlayer.addChatMessage(new ChatComponentText("Death Coordinates: X: " + x + " Y: " + y + " Z: " + z));
            }
        }
    }
}
