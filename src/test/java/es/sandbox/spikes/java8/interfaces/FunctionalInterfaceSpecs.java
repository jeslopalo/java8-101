package es.sandbox.spikes.java8.interfaces;

import es.sandbox.spikes.java8.InvocationSpy;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static es.sandbox.spikes.java8.FunctionalInterfaceCaller.call;
import static es.sandbox.spikes.java8.InvocationSpy.spy;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jeslopalo on 30/12/15.
 */
public class FunctionalInterfaceSpecs {

    private InvocationSpy spy;

    @Before
    public void setup() {
        this.spy = spy();
    }

    @Test
    public void has_only_one_declared_method() {
        final Method[] methods = SimpleFunctionalInterface.class.getDeclaredMethods();

        assertThat(methods).hasSize(1);
    }

    @Test
    public void when_is_used_in_a_lambda_it_invokes_the_unique_declared_method() {
        call(() -> this.spy.invocation());

        assertThat(this.spy.invoked()).isTrue();
    }
}
