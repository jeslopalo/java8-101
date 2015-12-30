package es.sandbox.spikes.java8;

/**
 * Created by jeslopalo on 30/12/15.
 */
public class InvocationSpy {

    private static InvocationSpy instance = new InvocationSpy();

    private boolean invoked;

    public static final InvocationSpy sharedSpy() {
        return instance;
    }

    public static final InvocationSpy spy() {
        return new InvocationSpy();
    }

    private InvocationSpy() {
        this.invoked = false;
    }

    public void invocation() {
        this.invoked = true;
    }

    public boolean invoked() {
        return this.invoked;
    }

    public void clear() {
        this.invoked = false;
    }
}
