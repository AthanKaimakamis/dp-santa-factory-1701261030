package model.bikes;

import model.attributes.colors.Color_DarkRed;
import model.attributes.suspension.Suspension_HardBody;

public class BmxBikePrefix extends BmxBike{

    public BmxBikePrefix() {
        setName("20 SUNDAY DARKWAVE AUTHENTIC TRANS 21.25");
        setTireSize(20);
        setSuspension(new Suspension_HardBody());
        setColor(new Color_DarkRed());
    }
}
