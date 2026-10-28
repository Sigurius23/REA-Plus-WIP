package com.mapbox.maps.module.telemetry;

import android.os.Bundle;
import com.mapbox.common.TelemetrySystemUtils;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m65681d2 = {"Lcom/mapbox/maps/module/telemetry/MapEventFactory;", "", "()V", "buildMapLoadEvent", "Lcom/mapbox/maps/module/telemetry/MapLoadEvent;", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "buildPerformanceEvent", "Lcom/mapbox/maps/module/telemetry/PerformanceEvent;", "sessionId", "", "data", "Landroid/os/Bundle;", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapEventFactory {
    public static final MapEventFactory INSTANCE = new MapEventFactory();

    private MapEventFactory() {
    }

    public final MapLoadEvent buildMapLoadEvent(PhoneState phoneState) {
        AbstractC22676k.m65750j(phoneState, "phoneState");
        return new MapLoadEvent(TelemetrySystemUtils.obtainUniversalUniqueIdentifier(), phoneState);
    }

    public final PerformanceEvent buildPerformanceEvent(PhoneState phoneState, String sessionId, Bundle data) {
        AbstractC22676k.m65750j(phoneState, "phoneState");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(data, "data");
        return new PerformanceEvent(phoneState, sessionId, data);
    }
}
