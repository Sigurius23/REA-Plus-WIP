package com.mapbox.common.location;

import java.util.List;

/* JADX INFO: renamed from: com.mapbox.common.location.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5436e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21928w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21929x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f21930y;

    public /* synthetic */ RunnableC5436e(int i13, Object obj, Object obj2) {
        this.f21928w = i13;
        this.f21929x = obj;
        this.f21930y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21928w) {
            case 0:
                GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$1((BaseDeviceLocationProvider.LocationCancelable) this.f21929x, (GetLocationCallback) this.f21930y);
                break;
            case 1:
                AndroidDeviceLocationProvider.getLastLocation$lambda$3((BaseDeviceLocationProvider.LocationCancelable) this.f21929x, (GetLocationCallback) this.f21930y);
                break;
            case 2:
                AndroidDeviceLocationProvider.getLastLocation$lambda$4((BaseDeviceLocationProvider.LocationCancelable) this.f21929x, (GetLocationCallback) this.f21930y);
                break;
            default:
                BaseLocationProvider.notifyLocationUpdate$lambda$1$lambda$0((LocationObserver) this.f21929x, (List) this.f21930y);
                break;
        }
    }
}
