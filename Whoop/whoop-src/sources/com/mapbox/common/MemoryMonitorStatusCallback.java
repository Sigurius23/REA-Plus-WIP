package com.mapbox.common;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
public interface MemoryMonitorStatusCallback {
    void run(Expected<String, MemoryMonitorStatus> expected);
}
