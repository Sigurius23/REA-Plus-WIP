package com.mapbox.common.location;

/* JADX INFO: loaded from: classes.dex */
public interface LocationServiceObserver {
    void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    void onAvailabilityChanged(boolean z4);

    void onPermissionStatusChanged(PermissionStatus permissionStatus);
}
