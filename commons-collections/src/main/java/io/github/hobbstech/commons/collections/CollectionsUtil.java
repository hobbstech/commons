package io.github.hobbstech.commons.collections;

import io.github.hobbstech.commonsutils.exceptions.IllegalOperationException;

import java.util.Collection;
import java.util.Map;

import static io.github.hobbstech.commonsutils.object.ObjectUtils.requireNonNull;

public class CollectionsUtil {

    /**
     *
     * @param collection @code{@link Collection} to be tested on
     * @return @code{@link Boolean} true is the collection is not empty
     */
    public static Boolean isNotEmpty(Collection collection){
        requireNonNull(collection, ()->new IllegalOperationException("Collection should not be empty"));
        return !collection.isEmpty();
    }

    /**
     *
     * @param map @code{@link Map} to be tested on
     * @return @code{@link Boolean} true is the map is not empty
     */
    public static Boolean isNotEmpty(Map map){
        requireNonNull(map, ()->new IllegalOperationException("Collection should not be empty"));
        return !map.isEmpty();
    }

    /**
     *
     * @param collection the @code{@link Collection} of elements to be tested on
     * @param element the element to be searched in the @code{collection}
     * @param <E> The type of the elements in the collection and of the element to be searched for
     * @return @code{@link Boolean} true if the element is not found in the collection
     */
    public static <E> Boolean isNotPresent(Collection<E> collection, E element){
        return !collection.contains(element);
    }

}
