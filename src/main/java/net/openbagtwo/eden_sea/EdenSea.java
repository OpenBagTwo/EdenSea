package net.openbagtwo.eden_sea;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdenSea implements ModInitializer {
  public static final String MOD_ID = "eden-sea";
  public static final String MOD_NAME = "Eden Sea";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
	LOGGER.info("Initializing " + MOD_NAME);
  }
}
