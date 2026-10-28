package com.mapbox.common.location;

import android.os.Looper;
import com.mapbox.common.Cancelable;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/mapbox/common/location/LocationProvider;", "", "Lcom/mapbox/common/location/LocationObserver;", "observer", "Ll83/a0;", "addLocationObserver", "(Lcom/mapbox/common/location/LocationObserver;)V", "Landroid/os/Looper;", "looper", "(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V", "removeLocationObserver", "Lcom/mapbox/common/location/GetLocationCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "getLastLocation", "(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface LocationProvider {
    void addLocationObserver(LocationObserver observer);

    void addLocationObserver(LocationObserver observer, Looper looper);

    Cancelable getLastLocation(GetLocationCallback callback);

    void removeLocationObserver(LocationObserver observer);
}
