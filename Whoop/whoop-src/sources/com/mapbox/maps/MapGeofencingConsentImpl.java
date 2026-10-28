package com.mapbox.maps;

import com.mapbox.common.geofencing.GeofencingUtils;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/MapGeofencingConsentImpl;", "Lcom/mapbox/maps/geofencing/MapGeofencingConsent;", "<init>", "()V", "", "isConsentGiven", "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;", "callback", "Ll83/a0;", "setUserConsent", "(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V", "getUserConsent", "()Z", "shouldShowConsent", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapGeofencingConsentImpl implements MapGeofencingConsent {
    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public boolean getUserConsent() {
        return GeofencingUtils.INSTANCE.getUserConsent();
    }

    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public void setUserConsent(boolean isConsentGiven, GeofencingUtilsUserConsentResponseCallback callback) {
        AbstractC22676k.m65750j(callback, "callback");
        GeofencingUtils.INSTANCE.setUserConsent(isConsentGiven, callback);
    }

    @Override // com.mapbox.maps.geofencing.MapGeofencingConsent
    public boolean shouldShowConsent() {
        GeofencingUtils.Companion companion = GeofencingUtils.INSTANCE;
        return !companion.getUserConsent() || companion.isActive();
    }
}
