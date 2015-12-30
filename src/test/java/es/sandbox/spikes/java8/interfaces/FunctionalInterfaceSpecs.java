package es.sandbox.spikes.java8.interfaces;

import es.sandbox.spikes.java8.InvocationSpy;
import org.junit.Before;
import org.junit.Test;

import static es.sandbox.spikes.java8.InvocationSpy.spy;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jeslopalo on 30/12/15.
 */
public class FunctionalInterfaceSpecs {

    private InvocationSpy spy;

    private static final void callFunctionalInterface(SimpleFunctionalInterface functionalInterface) {
        functionalInterface.doWork();
    }

    @Before
    public void setup() {
        this.spy = spy();
    }

    @Test
    public void has_one_callable_method() {
        callFunctionalInterface(() -> this.spy.invocation());

        assertThat(this.spy.invoked()).isTrue();
    }
}
