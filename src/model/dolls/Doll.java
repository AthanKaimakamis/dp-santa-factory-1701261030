package model.dolls;

import model.Toy;
import model.attributes.genders.IGender;
import model.attributes.materials.IMaterial;

public abstract class Doll extends Toy {
    protected IMaterial _material;
    protected IGender _gender;

    public abstract IMaterial get_material();

    public abstract void set_material(IMaterial material);

    public abstract IGender get_gender();

    public abstract void set_gender(IGender gender);
}
