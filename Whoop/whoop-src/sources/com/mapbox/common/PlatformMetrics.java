package com.mapbox.common;

import androidx.annotation.Keep;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Lcom/mapbox/common/PlatformMetrics;", "", "()V", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class PlatformMetrics {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m65681d2 = {"Lcom/mapbox/common/PlatformMetrics$Companion;", "", "()V", "getPlatformMetricsSources", "", "Lcom/mapbox/common/MetricsSource;", "type", "Lcom/mapbox/common/MetricsServiceType;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Keep
        public final List<MetricsSource> getPlatformMetricsSources(MetricsServiceType type) {
            AbstractC22676k.m65750j(type, "type");
            return AbstractC37056f.m118958J(MemoryMetricsSource.INSTANCE.getInstance());
        }

        private Companion() {
        }
    }

    @Keep
    public static final List<MetricsSource> getPlatformMetricsSources(MetricsServiceType metricsServiceType) {
        return INSTANCE.getPlatformMetricsSources(metricsServiceType);
    }
}
