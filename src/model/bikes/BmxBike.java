package model.bikes;

import model.attributes.colors.IColor;
import model.attributes.suspension.ISuspension;

public class BmxBike extends Bike{

    @Override
    public String getName() {
        return this._name;
    }

    @Override
    public void setName(String name) {
        this._name = name;
    }

    @Override
    public double getTireSize() {
        return this._tireSize;
    }

    @Override
    public void setTireSize(double tireSize) {
        this._tireSize = tireSize;
    }

    @Override
    public ISuspension getSuspension() {
        return this._suspension;
    }

    @Override
    public void setSuspension(ISuspension suspension) {
        this._suspension = suspension;
    }

    @Override
    public IColor getColor() {
        return this._color;
    }

    @Override
    public void setColor(IColor color) {
        this._color = color;
    }
}
