package ru.schepin.chapter9.factory;

public class Factories {
    public static void serviceCounsumer(ServiceFactory factory) {
        Service s= factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceCounsumer(new Immplementation1Factory());
    }
}
