package com.mapbox.common;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceLoadResultCallback {
    void run(Expected<ResourceLoadError, ResourceLoadResult> expected);
}
