package io.github.hobbstech.commonsutils.object;

import io.github.hobbstech.commonsutils.exceptions.IllegalOperationException;
import lombok.val;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ObjectUtilsTest {

    @Test(expected = NullPointerException.class)
    public void requireNonNull() {
        val obj = null;
        ObjectUtils.requireNonNull(obj, "Object should not be NULL");
    }

    @Test(expected = IllegalOperationException.class)
    public void requireNonNull1() {
        val obj = null;
        ObjectUtils.requireNonNull(obj, () -> new IllegalOperationException("Object should not be NULL"));
    }

    @Test
    public void nonEquals() {
        val obj1 = 3;
        val obj2 = 3L;
        val result = ObjectUtils.nonEquals(obj1, obj2);
        assertThat("Not equal", result);

        val obj3 = "test";
        val obj4 = "test";
        assertThat("Objects are equal", !ObjectUtils.nonEquals(obj3, obj4));
    }
}
