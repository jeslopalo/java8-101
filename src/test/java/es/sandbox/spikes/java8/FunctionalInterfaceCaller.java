package es.sandbox.spikes.java8;


import es.sandbox.spikes.java8.interfaces.ExtendedFunctionalInterface;
import es.sandbox.spikes.java8.interfaces.DefaultMethodsFunctionalInterface;
import es.sandbox.spikes.java8.interfaces.SimpleFunctionalInterface;

/**
 * Created by jeslopalo on 31/12/15.
 */
public class FunctionalInterfaceCaller {

    public static final void callSimpleFunctionalInterface(SimpleFunctionalInterface functionalInterface) {
        functionalInterface.doWork();
    }

    public static final void callExtendedFunctionalInterface(ExtendedFunctionalInterface functionalInterface) {
        functionalInterface.doWork();
    }

    public static final void callDefaultMethodsFunctionalInterface(DefaultMethodsFunctionalInterface functionalInterface) {
        functionalInterface.doWork();
    }
}
