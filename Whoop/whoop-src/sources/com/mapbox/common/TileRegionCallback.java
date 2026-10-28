package com.mapbox.common;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
public interface TileRegionCallback {
    void run(Expected<TileRegionError, TileRegion> expected);
}
