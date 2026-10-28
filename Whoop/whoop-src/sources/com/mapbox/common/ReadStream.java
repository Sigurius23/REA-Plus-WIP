package com.mapbox.common;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
public interface ReadStream {
    boolean isExhausted();

    boolean isReadable();

    Expected<String, Long> read(Buffer buffer);

    long readBytes();
}
