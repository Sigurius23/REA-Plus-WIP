package com.mapbox.common.location;

import android.app.PendingIntent;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/common/location/DeviceLocationProvider;", "Lcom/mapbox/common/location/LocationProvider;", "Landroid/app/PendingIntent;", "pendingIntent", "Ll83/a0;", "requestLocationUpdates", "(Landroid/app/PendingIntent;)V", "removeLocationUpdates", "", "getName", "()Ljava/lang/String;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface DeviceLocationProvider extends LocationProvider {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class DefaultImpls {
        public static String getName(DeviceLocationProvider deviceLocationProvider) {
            return "mapbox-user-defined";
        }
    }

    String getName();

    void removeLocationUpdates(PendingIntent pendingIntent);

    void requestLocationUpdates(PendingIntent pendingIntent) throws SecurityException;
}
