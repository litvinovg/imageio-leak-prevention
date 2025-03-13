package osl.tib.eu.ImageIO;

import javax.imageio.ImageIO;

public class LeakPrevention {

    static {
        ImageIO.scanForPlugins();
    }
}
