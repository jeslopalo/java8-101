package es.sandbox.spikes.java8.interfaces;

/**
 * Created by jeslopalo on 28/1/16.
 */
@FunctionalInterface
public interface DefaultMethodsFunctionalInterface {

    void doWork();

    default void defaultMethod() {
        //do whatever
    }
}
