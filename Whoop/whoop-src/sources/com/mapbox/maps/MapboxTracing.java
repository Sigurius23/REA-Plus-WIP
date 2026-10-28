package com.mapbox.maps;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/mapbox/maps/MapboxTracing;", "", "<init>", "()V", "Ll83/a0;", "enableAll", "enablePlatform", "enableCore", "disableAll", "", "MAPBOX_TRACE_ID", "Ljava/lang/String;", "", "platformTracingEnabled", "Z", "getPlatformTracingEnabled$maps_sdk_release", "()Z", "setPlatformTracingEnabled$maps_sdk_release", "(Z)V", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxTracing {
    public static final MapboxTracing INSTANCE = new MapboxTracing();
    public static final String MAPBOX_TRACE_ID = "mbx";
    private static boolean platformTracingEnabled;

    private MapboxTracing() {
    }

    public final void disableAll() {
        platformTracingEnabled = false;
        Tracing.setTracingBackendType(TracingBackendType.NOOP);
    }

    public final void enableAll() {
        platformTracingEnabled = true;
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enableCore() {
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enablePlatform() {
        platformTracingEnabled = true;
    }

    public final boolean getPlatformTracingEnabled$maps_sdk_release() {
        return platformTracingEnabled;
    }

    public final void setPlatformTracingEnabled$maps_sdk_release(boolean z4) {
        platformTracingEnabled = z4;
    }
}
