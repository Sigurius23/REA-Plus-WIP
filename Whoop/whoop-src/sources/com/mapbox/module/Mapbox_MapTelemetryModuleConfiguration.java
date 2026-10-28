package com.mapbox.module;

import androidx.annotation.Keep;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/module/Mapbox_MapTelemetryModuleConfiguration;", "", "()V", "enableConfiguration", "", "getEnableConfiguration$annotations", "getEnableConfiguration", "()Z", "implClass", "Ljava/lang/Class;", "Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;", "getImplClass$annotations", "getImplClass", "()Ljava/lang/Class;", "module-telemetry_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class Mapbox_MapTelemetryModuleConfiguration {
    private static final boolean enableConfiguration = false;
    public static final Mapbox_MapTelemetryModuleConfiguration INSTANCE = new Mapbox_MapTelemetryModuleConfiguration();
    private static final Class<MapTelemetryImpl> implClass = MapTelemetryImpl.class;

    private Mapbox_MapTelemetryModuleConfiguration() {
    }

    public static final boolean getEnableConfiguration() {
        return enableConfiguration;
    }

    public static /* synthetic */ void getEnableConfiguration$annotations() {
    }

    public static final Class<MapTelemetryImpl> getImplClass() {
        return implClass;
    }

    public static /* synthetic */ void getImplClass$annotations() {
    }
}
