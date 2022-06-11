package model.factories;

import model.Toy;
import model.dolls.*;
import model.references.EDolls;

public class DollFactory implements IToyFactory {

    @Override
    public Toy createPrefixToy(Enum toy) {
        if (toy == null) return null;
        if (toy.equals(EDolls.Barbie)) return new BarbieDollPrefix();
        if (toy.equals(EDolls.GiJoe)) return new GiJoeDollPrefix();
        if (toy.equals(EDolls.Vintage)) return new VintageDollPrefix();
        if (toy.equals(EDolls.Muppet)) return new MuppetDollPrefix();
        return null;
    }

    @Override
    public Toy createCustomToy(Enum toy) {
        if (toy == null) return null;
        if (toy.equals(EDolls.Barbie)) return new BarbieDoll();
        if (toy.equals(EDolls.GiJoe)) return new GiJoeDoll();
        if (toy.equals(EDolls.Vintage)) return new VintageDoll();
        if (toy.equals(EDolls.Muppet)) return new MuppetDoll();
        return null;
    }
}
