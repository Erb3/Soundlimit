package github.erb3.mod.soundlimit.mixin;

import net.minecraft.client.sound.SoundEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(SoundEngine.class)
public class SoundEngineMixin {
    @ModifyArg(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/sound/SoundEngine$SourceSetImpl;<init>(I)V"), index = 0)
    private int increaseMaxSoundSources(int original) {
        return 128;
    }
}
