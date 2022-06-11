package model.bikes;


import model.attributes.colors.Color_ElectricBlue;
import model.attributes.suspension.Suspension_Frontal;

public class MountainBikePrefix extends MountainBike{
    public MountainBikePrefix() {
        setName("29 CROSS GRX8 HDB");
        setTireSize(29);
        setSuspension(new Suspension_Frontal());
        setColor(new Color_ElectricBlue());
    }
}
