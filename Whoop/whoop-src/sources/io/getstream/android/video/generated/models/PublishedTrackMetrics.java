package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003Jc\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m65681d2 = {"Lio/getstream/android/video/generated/models/PublishedTrackMetrics;", "", "codec", "", "trackId", "trackType", "warnings", "", "Lio/getstream/android/video/generated/models/SessionWarningResponse;", "bitrate", "Lio/getstream/android/video/generated/models/MetricTimeSeries;", "framerate", "resolution", "Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/MetricTimeSeries;Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;)V", "getBitrate", "()Lio/getstream/android/video/generated/models/MetricTimeSeries;", "getCodec", "()Ljava/lang/String;", "getFramerate", "getResolution", "()Lio/getstream/android/video/generated/models/ResolutionMetricsTimeSeries;", "getTrackId", "getTrackType", "getWarnings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class PublishedTrackMetrics {
    private final MetricTimeSeries bitrate;
    private final String codec;
    private final MetricTimeSeries framerate;
    private final ResolutionMetricsTimeSeries resolution;
    private final String trackId;
    private final String trackType;
    private final List<SessionWarningResponse> warnings;

    public PublishedTrackMetrics() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishedTrackMetrics copy$default(PublishedTrackMetrics publishedTrackMetrics, String str, String str2, String str3, List list, MetricTimeSeries metricTimeSeries, MetricTimeSeries metricTimeSeries2, ResolutionMetricsTimeSeries resolutionMetricsTimeSeries, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = publishedTrackMetrics.codec;
        }
        if ((i13 & 2) != 0) {
            str2 = publishedTrackMetrics.trackId;
        }
        if ((i13 & 4) != 0) {
            str3 = publishedTrackMetrics.trackType;
        }
        if ((i13 & 8) != 0) {
            list = publishedTrackMetrics.warnings;
        }
        if ((i13 & 16) != 0) {
            metricTimeSeries = publishedTrackMetrics.bitrate;
        }
        if ((i13 & 32) != 0) {
            metricTimeSeries2 = publishedTrackMetrics.framerate;
        }
        if ((i13 & 64) != 0) {
            resolutionMetricsTimeSeries = publishedTrackMetrics.resolution;
        }
        MetricTimeSeries metricTimeSeries3 = metricTimeSeries2;
        ResolutionMetricsTimeSeries resolutionMetricsTimeSeries2 = resolutionMetricsTimeSeries;
        MetricTimeSeries metricTimeSeries4 = metricTimeSeries;
        String str4 = str3;
        return publishedTrackMetrics.copy(str, str2, str4, list, metricTimeSeries4, metricTimeSeries3, resolutionMetricsTimeSeries2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTrackType() {
        return this.trackType;
    }

    public final List<SessionWarningResponse> component4() {
        return this.warnings;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MetricTimeSeries getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MetricTimeSeries getFramerate() {
        return this.framerate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ResolutionMetricsTimeSeries getResolution() {
        return this.resolution;
    }

    public final PublishedTrackMetrics copy(@InterfaceC30731q(name = "codec") String codec, @InterfaceC30731q(name = "track_id") String trackId, @InterfaceC30731q(name = "track_type") String trackType, @InterfaceC30731q(name = "warnings") List<SessionWarningResponse> warnings, @InterfaceC30731q(name = "bitrate") MetricTimeSeries bitrate, @InterfaceC30731q(name = "framerate") MetricTimeSeries framerate, @InterfaceC30731q(name = "resolution") ResolutionMetricsTimeSeries resolution) {
        return new PublishedTrackMetrics(codec, trackId, trackType, warnings, bitrate, framerate, resolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishedTrackMetrics)) {
            return false;
        }
        PublishedTrackMetrics publishedTrackMetrics = (PublishedTrackMetrics) other;
        return AbstractC22676k.m65745e(this.codec, publishedTrackMetrics.codec) && AbstractC22676k.m65745e(this.trackId, publishedTrackMetrics.trackId) && AbstractC22676k.m65745e(this.trackType, publishedTrackMetrics.trackType) && AbstractC22676k.m65745e(this.warnings, publishedTrackMetrics.warnings) && AbstractC22676k.m65745e(this.bitrate, publishedTrackMetrics.bitrate) && AbstractC22676k.m65745e(this.framerate, publishedTrackMetrics.framerate) && AbstractC22676k.m65745e(this.resolution, publishedTrackMetrics.resolution);
    }

    public final MetricTimeSeries getBitrate() {
        return this.bitrate;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final MetricTimeSeries getFramerate() {
        return this.framerate;
    }

    public final ResolutionMetricsTimeSeries getResolution() {
        return this.resolution;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final String getTrackType() {
        return this.trackType;
    }

    public final List<SessionWarningResponse> getWarnings() {
        return this.warnings;
    }

    public int hashCode() {
        String str = this.codec;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trackId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SessionWarningResponse> list = this.warnings;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        MetricTimeSeries metricTimeSeries = this.bitrate;
        int iHashCode5 = (iHashCode4 + (metricTimeSeries == null ? 0 : metricTimeSeries.hashCode())) * 31;
        MetricTimeSeries metricTimeSeries2 = this.framerate;
        int iHashCode6 = (iHashCode5 + (metricTimeSeries2 == null ? 0 : metricTimeSeries2.hashCode())) * 31;
        ResolutionMetricsTimeSeries resolutionMetricsTimeSeries = this.resolution;
        return iHashCode6 + (resolutionMetricsTimeSeries != null ? resolutionMetricsTimeSeries.hashCode() : 0);
    }

    public String toString() {
        String str = this.codec;
        String str2 = this.trackId;
        String str3 = this.trackType;
        List<SessionWarningResponse> list = this.warnings;
        MetricTimeSeries metricTimeSeries = this.bitrate;
        MetricTimeSeries metricTimeSeries2 = this.framerate;
        ResolutionMetricsTimeSeries resolutionMetricsTimeSeries = this.resolution;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PublishedTrackMetrics(codec=", str, ", trackId=", str2, ", trackType=");
        AbstractC36095b.m114694v(str3, ", warnings=", ", bitrate=", sbM32001t, list);
        sbM32001t.append(metricTimeSeries);
        sbM32001t.append(", framerate=");
        sbM32001t.append(metricTimeSeries2);
        sbM32001t.append(", resolution=");
        sbM32001t.append(resolutionMetricsTimeSeries);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PublishedTrackMetrics(@InterfaceC30731q(name = "codec") String str, @InterfaceC30731q(name = "track_id") String str2, @InterfaceC30731q(name = "track_type") String str3, @InterfaceC30731q(name = "warnings") List<SessionWarningResponse> list, @InterfaceC30731q(name = "bitrate") MetricTimeSeries metricTimeSeries, @InterfaceC30731q(name = "framerate") MetricTimeSeries metricTimeSeries2, @InterfaceC30731q(name = "resolution") ResolutionMetricsTimeSeries resolutionMetricsTimeSeries) {
        this.codec = str;
        this.trackId = str2;
        this.trackType = str3;
        this.warnings = list;
        this.bitrate = metricTimeSeries;
        this.framerate = metricTimeSeries2;
        this.resolution = resolutionMetricsTimeSeries;
    }

    public /* synthetic */ PublishedTrackMetrics(String str, String str2, String str3, List list, MetricTimeSeries metricTimeSeries, MetricTimeSeries metricTimeSeries2, ResolutionMetricsTimeSeries resolutionMetricsTimeSeries, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : metricTimeSeries, (i13 & 32) != 0 ? null : metricTimeSeries2, (i13 & 64) != 0 ? null : resolutionMetricsTimeSeries);
    }
}
