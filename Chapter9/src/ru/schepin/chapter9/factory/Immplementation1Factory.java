package ru.schepin.chapter9.factory;

public class Immplementation1Factory implements ServiceFactory {
    public Service getService() {
        return new Implementation1();
    }
}
