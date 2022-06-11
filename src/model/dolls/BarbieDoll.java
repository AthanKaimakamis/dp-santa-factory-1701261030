package model.dolls;

import model.attributes.genders.IGender;
import model.attributes.materials.IMaterial;

public class BarbieDoll extends Doll{

    @Override
    public String getName() {
        return this._name;
    }

    @Override
    public void setName(String name) {
        this._name = name;
    }

    @Override
    public IMaterial get_material() {
        return this._material;
    }

    @Override
    public void set_material(IMaterial material) {
        this._material = material;
    }

    @Override
    public IGender get_gender() {
        return this._gender;
    }

    @Override
    public void set_gender(IGender gender) {
        this._gender = gender;
    }
}
