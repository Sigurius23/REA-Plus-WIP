package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;", "", "height", "Lio/getstream/android/video/generated/models/MetricTimeSeries;", "width", "(Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;)V", "getHeight", "()Lio/getstream/android/video/generated/models/MetricTimeSeries;", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ResolutionMetricsTimeSeries {
    private final MetricTimeSeries height;
    private final MetricTimeSeries width;

    /* JADX WARN: Multi-variable type inference failed */
    public ResolutionMetricsTimeSeries() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ResolutionMetricsTimeSeries copy$default(ResolutionMetricsTimeSeries resolutionMetricsTimeSeries, MetricTimeSeries metricTimeSeries, MetricTimeSeries metricTimeSeries2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            metricTimeSeries = resolutionMetricsTimeSeries.height;
        }
        if ((i13 & 2) != 0) {
            metricTimeSeries2 = resolutionMetricsTimeSeries.width;
        }
        return resolutionMetricsTimeSeries.copy(metricTimeSeries, metricTimeSeries2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetricTimeSeries getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MetricTimeSeries getWidth() {
        return this.width;
    }

    public final ResolutionMetricsTimeSeries copy(@InterfaceC30731q(name = "height") MetricTimeSeries height, @InterfaceC30731q(name = "width") MetricTimeSeries width) {
        return new ResolutionMetricsTimeSeries(height, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolutionMetricsTimeSeries)) {
            return false;
        }
        ResolutionMetricsTimeSeries resolutionMetricsTimeSeries = (ResolutionMetricsTimeSeries) other;
        return AbstractC22676k.m65745e(this.height, resolutionMetricsTimeSeries.height) && AbstractC22676k.m65745e(this.width, resolutionMetricsTimeSeries.width);
    }

    public final MetricTimeSeries getHeight() {
        return this.height;
    }

    public final MetricTimeSeries getWidth() {
        return this.width;
    }

    public int hashCode() {
        MetricTimeSeries metricTimeSeries = this.height;
        int iHashCode = (metricTimeSeries == null ? 0 : metricTimeSeries.hashCode()) * 31;
        MetricTimeSeries metricTimeSeries2 = this.width;
        return iHashCode + (metricTimeSeries2 != null ? metricTimeSeries2.hashCode() : 0);
    }

    public String toString() {
        return "ResolutionMetricsTimeSeries(height=" + this.height + ", width=" + this.width + ")";
    }

    public ResolutionMetricsTimeSeries(@InterfaceC30731q(name = "height") MetricTimeSeries metricTimeSeries, @InterfaceC30731q(name = "width") MetricTimeSeries metricTimeSeries2) {
        this.height = metricTimeSeries;
        this.width = metricTimeSeries2;
    }

    public /* synthetic */ ResolutionMetricsTimeSeries(MetricTimeSeries metricTimeSeries, MetricTimeSeries metricTimeSeries2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : metricTimeSeries, (i13 & 2) != 0 ? null : metricTimeSeries2);
    }
}
