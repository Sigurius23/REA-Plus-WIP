package com.mapbox.common.location;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface LocationObserver {
    void onLocationUpdateReceived(List<Location> list);
}
