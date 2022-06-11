package app;

import model.Toy;
import model.factories.BikeFactory;
import model.factories.DollFactory;
import model.factories.IToyFactory;
import model.references.EBikes;
import model.references.EDolls;

import java.util.*;

public class SantaClaus implements ISubject{

    private static SantaClaus instance;
    public static SantaClaus getInstance(){
        if (instance == null) instance = new SantaClaus();
        return instance;
    }
    private static IToyFactory _bikeFactory = new BikeFactory();
    private static IToyFactory _dollFactory = new DollFactory();
    private List<IObserver> _observers = new ArrayList<>();
    private static List<Enum> _toysToBeMade = new ArrayList<>();
    private static Kid currentKid;

    public static IToyFactory get_bikeFactory() { return _bikeFactory; }
    public static IToyFactory get_dollFactory() { return _dollFactory; }

    public static List<Enum> get_toysToBeMade() {
        return _toysToBeMade;
    }

    public SantaClaus() {
        for (int i = 0; i < 5; i++){
            assignObserver(new Dwarf());
        }
    }

    public static void get_Wish(Kid kid){
        if (kid.wasGood()){
            currentKid = kid;
            Random rand = new Random();
            List<Enum> list = new ArrayList<>();
            for (Enum bike: EBikes.values()){
                list.add(bike);
            }
            for (Enum doll: EDolls.values()){
                list.add(doll);
            }

            _toysToBeMade.add( list.get(rand.nextInt(list.size() - 1)));
            getInstance().notifyObserver();
        }
    }

    public static void orderExecuted(Toy toy){
        _toysToBeMade.remove(0);
        currentKid.setToy(toy);
    }

    @Override
    public void assignObserver(IObserver observer) {
        this._observers.add(observer);
    }

    @Override
    public void disposeObserver(IObserver observer) {
        this._observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer: this._observers){
            observer.update();
        }
    }

}
