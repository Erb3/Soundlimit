package github.erb3.mod.soundlimit;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Soundlimit implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("soundlimit");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Soundlimit is being loaded.");
	}
}
