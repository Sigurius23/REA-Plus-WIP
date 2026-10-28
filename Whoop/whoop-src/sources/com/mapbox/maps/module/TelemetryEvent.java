package com.mapbox.maps.module;

import com.mapbox.common.FeatureTelemetryCounter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/mapbox/maps/module/TelemetryEvent;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ll83/a0;", "increment", "()V", "Ljava/lang/String;", "Lcom/mapbox/common/FeatureTelemetryCounter;", "counter", "Lcom/mapbox/common/FeatureTelemetryCounter;", "Companion", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class TelemetryEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FeatureTelemetryCounter counter;
    private final String name;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/maps/module/TelemetryEvent$Companion;", "", "()V", "create", "Lcom/mapbox/maps/module/TelemetryEvent;", "name", "", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TelemetryEvent create(String name) {
            AbstractC22676k.m65750j(name, "name");
            return new TelemetryEvent("maps-mobile/".concat(name), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TelemetryEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final void increment() {
        FeatureTelemetryCounter featureTelemetryCounter = this.counter;
        if (featureTelemetryCounter != null) {
            featureTelemetryCounter.increment();
        }
    }

    private TelemetryEvent(String str) {
        FeatureTelemetryCounter featureTelemetryCounterCreate;
        this.name = str;
        try {
            featureTelemetryCounterCreate = FeatureTelemetryCounter.create(str);
        } catch (Throwable unused) {
            featureTelemetryCounterCreate = null;
        }
        this.counter = featureTelemetryCounterCreate;
    }
}
