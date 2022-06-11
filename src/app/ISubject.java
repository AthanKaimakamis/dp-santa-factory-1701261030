package app;

public interface ISubject {

    void assignObserver(IObserver observer);
    void disposeObserver(IObserver observer);
    void notifyObserver();
}
