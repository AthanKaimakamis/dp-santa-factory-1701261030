package model.factories;

import model.Toy;

public interface IToyFactory {
    Toy createPrefixToy(Enum toy);
    Toy createCustomToy(Enum toy);
}
