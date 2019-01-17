package io.github.hobbstech.commons.collections;

import lombok.val;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;

public class CollectionsUtilTest {

    @Test
    public void isNotEmpty() {

        val collection = Collections.EMPTY_LIST;
        val result = CollectionsUtil.isNotEmpty(collection);

        assertThat("Collection empty", !result);

    }

    @Test
    public void isNotEmpty1() {

        val map = Collections.EMPTY_MAP;
        val result = CollectionsUtil.isNotEmpty(map);

        assertThat("Map empty", !result);

    }
}
