package model.bikes;

import model.attributes.colors.Color_MattBlack;
import model.attributes.suspension.Suspension_Double;

public class ElectricBikePrefix extends ElectricBike{
    public ElectricBikePrefix() {
        setName("29 SPECIALIZED LEVO EXP CRBN CARB SMK");
        setTireSize(29);
        setSuspension(new Suspension_Double());
        setColor(new Color_MattBlack());
    }
}
