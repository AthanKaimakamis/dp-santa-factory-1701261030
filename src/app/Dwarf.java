package app;


import model.Toy;
import model.references.EBikes;
import model.references.EDolls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dwarf implements ICommand, IObserver{

    private Toy _toy;

    private List<Enum> orderStatus = new ArrayList<>();
    @Override
    public void startDwarfing(Enum toy) {


        if (Arrays.stream(EBikes.values()).toList().contains(toy))
        {
            this._toy = SantaClaus.get_bikeFactory().createPrefixToy(toy);
        }
        if (Arrays.stream(EDolls.values()).toList().contains(toy)){
            this._toy = SantaClaus.get_dollFactory().createPrefixToy(toy);
        }
    }

    @Override
    public void update() {
        orderStatus = SantaClaus.get_toysToBeMade();
        if (orderStatus.isEmpty())
            return;
        Enum toy = orderStatus.get(0);
        startDwarfing(toy);
        SantaClaus.orderExecuted(_toy);
    }
}
