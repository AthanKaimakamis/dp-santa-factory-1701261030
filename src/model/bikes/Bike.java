package model.bikes;

import model.Toy;
import model.attributes.colors.IColor;
import model.attributes.suspension.ISuspension;

public abstract class Bike extends Toy {
    protected double _tireSize;
    protected ISuspension _suspension;
    protected IColor _color;

    public abstract double getTireSize();

    public abstract void setTireSize(double tireSize);

    public abstract ISuspension getSuspension();

    public abstract void setSuspension(ISuspension ISuspension);

    public abstract IColor getColor();

    public abstract void setColor(IColor color);
}
