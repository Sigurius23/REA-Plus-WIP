package com.mapbox.maps;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface OfflineRegionObserver {
    void errorOccurred(OfflineRegionError offlineRegionError);

    void statusChanged(OfflineRegionStatus offlineRegionStatus);
}
