package model.dolls;

import model.attributes.genders.Gender_Female;
import model.attributes.materials.Material_Plastic;

public class BarbieDollPrefix extends BarbieDoll{
    public BarbieDollPrefix() {
        setName("Barbie® Extra Fancy™ Doll And Accessories");
        set_material(new Material_Plastic());
        set_gender(new Gender_Female());
    }
}
