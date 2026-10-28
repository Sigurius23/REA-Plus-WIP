package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes.dex */
public final class ExpectedFactory {
    private ExpectedFactory() {
    }

    public static <E, V> Expected<E, V> createError(E e5) {
        return new Expected<>(e5, null);
    }

    public static <E> Expected<E, None> createNone() {
        return new Expected<>(null, None.getInstance());
    }

    public static <E, V> Expected<E, V> createValue(V v13) {
        return new Expected<>(null, v13);
    }
}
