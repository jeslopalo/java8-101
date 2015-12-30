package es.sandbox.spikes.java8.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static es.sandbox.spikes.java8.InvocationSpy.sharedSpy;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jeslopalo on 29/12/15.
 */

public class LambdaSpecs {

    private static final String[] ARRAY_OF_STRINGS = new String[]{"a", "b", "c"};

    private List<String> result;

    @Before
    public void setup() {
        this.result = new ArrayList<>();
    }


    @Test
    public void the_arrow_is_the_body_separator() {
        Arrays.asList(ARRAY_OF_STRINGS)
                .forEach((String e) -> sharedSpy().invocation());

        assertThat(sharedSpy().invoked()).isTrue();
    }

    @Test
    public void the_argument_type_can_be_inferred() {
        Arrays.asList(ARRAY_OF_STRINGS)
                .forEach(e -> sharedSpy().invocation());

        assertThat(sharedSpy().invoked()).isTrue();
    }

    @Test
    public void complex_bodies_can_be_wrapped_into_curly_brackets() {
        Arrays.asList(ARRAY_OF_STRINGS)
                .forEach(e -> {
                    final String upper = e.toUpperCase();
                    this.result.add(upper);
                });

        assertThat(this.result).containsExactly("A", "B", "C");
    }

    @Test
    public void it_may_reference_to_local_variables() {
        final String addition = "+";

        Arrays.asList(ARRAY_OF_STRINGS)
                .forEach(e -> this.result.add(e + addition));

        assertThat(this.result).containsExactly("a+", "b+", "c+");
    }

    @Test
    public void it_may_return_a_value() {
        final List<String> elements = Arrays.asList("c", "a", "b");

        elements.sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });

        assertThat(elements).containsExactly("a", "b", "c");
    }

    @Test
    public void return_statements_is_not_required_if_body_is_oneliner() {
        final List<String> elements = Arrays.asList("c", "a", "b");

        elements.sort((e1, e2) -> e1.compareTo(e2));

        assertThat(elements).containsExactly("a", "b", "c");
    }
}
