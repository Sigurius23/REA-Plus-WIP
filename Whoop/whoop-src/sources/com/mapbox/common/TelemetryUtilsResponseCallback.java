package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes.dex */
public interface TelemetryUtilsResponseCallback {
    void run(Expected<EventsServiceError, None> expected);
}
