package es.sandbox.spikes.java8;

/**
 * Created by jeslopalo on 30/12/15.
 */
public class InvocationSpy {

    private int times;

    public static final InvocationSpy spy() {
        return new InvocationSpy();
    }

    private InvocationSpy() {
        this.times = 0;
    }

    public void invocation() {
        this.times++;
    }

    public boolean invoked() {
        return this.times > 0;
    }

    public boolean timesInvoked(int times) {
        return this.times == times;
    }

    public void clear() {
        this.times = 0;
    }
}
