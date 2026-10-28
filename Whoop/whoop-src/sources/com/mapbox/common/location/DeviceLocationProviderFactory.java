package com.mapbox.common.location;

import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
public interface DeviceLocationProviderFactory {
    Expected<LocationError, DeviceLocationProvider> build(LocationProviderRequest locationProviderRequest);
}
