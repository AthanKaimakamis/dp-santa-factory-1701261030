package model.dolls;

import model.attributes.genders.Gender_Female;
import model.attributes.materials.Material_Fabric;

public class MuppetDollPrefix extends MuppetDoll{
    public MuppetDollPrefix() {
        setName("Miss Piggy Disney nuiMOs Plush – The Muppets");
        set_material(new Material_Fabric());
        set_gender(new Gender_Female());
    }
}
