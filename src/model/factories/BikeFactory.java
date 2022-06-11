package model.factories;

import model.Toy;
import model.bikes.*;
import model.references.EBikes;

public class BikeFactory implements IToyFactory {

    @Override
    public Toy createPrefixToy(Enum toy) {
        if(toy == null) return null;
        if (toy == EBikes.Bmx) return new BmxBikePrefix();
        if (toy == EBikes.Electric) return new ElectricBikePrefix();
        if (toy == EBikes.Mountain) return new MountainBikePrefix();
        if (toy == EBikes.Racing) return new RacingBikePrefix();
        return null;
    }

    @Override
    public Toy createCustomToy(Enum toy) {
        if (toy == null) return null;
        if (toy == EBikes.Bmx) return new BmxBike();
        if (toy == EBikes.Electric) return new ElectricBike();
        if (toy == EBikes.Mountain) return new MountainBike();
        if (toy == EBikes.Racing) return new RacingBike();
        return null;
    }
}
