package es.sandbox.spikes.java8;


import es.sandbox.spikes.java8.interfaces.SimpleFunctionalInterface;

/**
 * Created by jeslopalo on 31/12/15.
 */
public class FunctionalInterfaceCaller {

    public static final void call(SimpleFunctionalInterface functionalInterface) {
        functionalInterface.doWork();
    }
}
