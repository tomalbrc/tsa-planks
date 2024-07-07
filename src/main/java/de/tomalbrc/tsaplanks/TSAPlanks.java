package de.tomalbrc.tsaplanks;

import com.mojang.logging.LogUtils;
import de.tomalbrc.filament.api.FilamentLoader;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class TSAPlanks implements ModInitializer {
    private static Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        try {
            FilamentLoader.loadBlocks("tsa-planks");
            PolymerResourcePackUtils.addModAssets("tsa-planks");
            PolymerResourcePackUtils.markAsRequired();
        } catch (Exception e) {
            LOGGER.error("Could not load some files!");
            e.printStackTrace();
        }
    }
}
