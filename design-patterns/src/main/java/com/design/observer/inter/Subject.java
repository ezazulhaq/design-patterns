package com.design.observer.inter;

import java.util.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
