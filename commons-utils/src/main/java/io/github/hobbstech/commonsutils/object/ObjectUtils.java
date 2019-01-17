package io.github.hobbstech.commonsutils.object;

import java.util.function.Supplier;

public class ObjectUtils {

    private ObjectUtils() {
    }

    public static void requireNonNull(Object target, String message) {
        if (target == null)
            throw new NullPointerException(message);
    }

    public static <X extends Throwable> void requireNonNull(Object target, Supplier<? super X> supplier) throws X {
        if (target == null)
            throw (X) supplier.get();
    }

    public static <T> Boolean nonEquals(T obj1, T obj2) {

        if (obj1 == obj2)
            return false;

        return !obj1.equals(obj2);

    }


}
