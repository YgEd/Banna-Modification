package assets.firstmod.utils;

import com.jigglebean.firstmod.firstmod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
	
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = 
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, firstmod.MOD_ID);

	
	public static final RegistryObject<SoundEvent> BONK = 
			registerSoundEvent("bonk");
	
	public static RegistryObject<SoundEvent> registerSoundEvent(String name){
		return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(firstmod.MOD_ID, name)));
	}
	
	public static void register(IEventBus eventBus) {
		SOUND_EVENTS.register(eventBus);
	}
	
	
}
