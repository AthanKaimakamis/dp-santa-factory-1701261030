package app;

import model.Toy;

public class Kid {
    private String _name;
    private boolean _wasGood;
    private String _wish;
    private Toy toy;


    public Kid(String name, boolean wasGood, String wish) {
        this._name = name;
        this._wasGood = wasGood;
        this._wish = wish;
    }

    public String get_name() {
        return _name;
    }

    public boolean wasGood() {
        return _wasGood;
    }

    public String get_wish() {
        return _wish;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
        if (toy != null)
            System.out.println("I am " + get_name() + " and i got " + toy.getName());
    }
}
