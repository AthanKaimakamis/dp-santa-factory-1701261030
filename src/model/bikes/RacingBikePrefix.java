package model.bikes;

import model.attributes.colors.Color_GlossWhite;
import model.attributes.suspension.Suspension_HardBody;

public class RacingBikePrefix extends RacingBike{
    public RacingBikePrefix() {
        setName("28 CUBE AXIAL WS WHT CORAL");
        setTireSize(28);
        setSuspension(new Suspension_HardBody());
        setColor(new Color_GlossWhite());
    }
}
