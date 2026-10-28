package com.mapbox.common.location;

/* JADX INFO: renamed from: com.mapbox.common.location.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5435d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BaseDeviceLocationProvider.LocationCancelable f21925x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ GetLocationCallback f21926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ android.location.Location f21927z;

    public /* synthetic */ RunnableC5435d(BaseDeviceLocationProvider.LocationCancelable locationCancelable, GetLocationCallback getLocationCallback, android.location.Location location, int i13) {
        this.f21924w = i13;
        this.f21925x = locationCancelable;
        this.f21926y = getLocationCallback;
        this.f21927z = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21924w) {
            case 0:
                GoogleDeviceLocationProvider$getLastLocation$1$1.invoke$lambda$0(this.f21925x, this.f21926y, this.f21927z);
                break;
            default:
                AndroidDeviceLocationProvider.getLastLocation$lambda$2(this.f21925x, this.f21926y, this.f21927z);
                break;
        }
    }
}
