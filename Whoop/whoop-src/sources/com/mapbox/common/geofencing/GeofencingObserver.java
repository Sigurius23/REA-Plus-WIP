package com.mapbox.common.geofencing;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingObserver;", "", "Lcom/mapbox/common/geofencing/GeofencingEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "onEntry", "(Lcom/mapbox/common/geofencing/GeofencingEvent;)V", "onDwell", "onExit", "Lcom/mapbox/common/geofencing/GeofencingError;", "error", "onError", "(Lcom/mapbox/common/geofencing/GeofencingError;)V", "", "isConsentGiven", "onUserConsentChanged", "(Z)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface GeofencingObserver {
    void onDwell(GeofencingEvent event);

    void onEntry(GeofencingEvent event);

    void onError(GeofencingError error);

    void onExit(GeofencingEvent event);

    void onUserConsentChanged(boolean isConsentGiven);
}
