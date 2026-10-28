package com.mapbox.maps.geofencing;

import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.MapboxExperimental;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "", "", "isConsentGiven", "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;", "callback", "Ll83/a0;", "setUserConsent", "(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V", "getUserConsent", "()Z", "shouldShowConsent", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@MapboxExperimental
public interface MapGeofencingConsent {
    @MapboxExperimental
    boolean getUserConsent();

    @MapboxExperimental
    void setUserConsent(boolean isConsentGiven, GeofencingUtilsUserConsentResponseCallback callback);

    @MapboxExperimental
    boolean shouldShowConsent();
}
