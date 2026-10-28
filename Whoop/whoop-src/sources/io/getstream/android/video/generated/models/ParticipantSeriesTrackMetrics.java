package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\"\b\u0003\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\t\u0018\u00010\u000b\u0012\u0016\b\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u001c\b\u0003\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J#\u0010$\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\t\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u001d\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000bHÆ\u0003J¯\u0001\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\"\b\u0003\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\t\u0018\u00010\u000b2\u0016\b\u0003\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u001c\b\u0003\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R+\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006."}, m65681d2 = {"Lio/getstream/android/video/generated/models/ParticipantSeriesTrackMetrics;", "", "trackId", "", "codec", "label", "rid", "trackType", "metricsOrder", "", "metrics", "", "", "metricsMeta", "Lio/getstream/android/video/generated/models/MetricDescriptor;", "thresholds", "Lio/getstream/android/video/generated/models/MetricThreshold;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getCodec", "()Ljava/lang/String;", "getLabel", "getMetrics", "()Ljava/util/Map;", "getMetricsMeta", "getMetricsOrder", "()Ljava/util/List;", "getRid", "getThresholds", "getTrackId", "getTrackType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ParticipantSeriesTrackMetrics {
    private final String codec;
    private final String label;
    private final Map<String, List<List<Float>>> metrics;
    private final Map<String, MetricDescriptor> metricsMeta;
    private final List<String> metricsOrder;
    private final String rid;
    private final Map<String, List<MetricThreshold>> thresholds;
    private final String trackId;
    private final String trackType;

    /* JADX WARN: Multi-variable type inference failed */
    public ParticipantSeriesTrackMetrics(@InterfaceC30731q(name = "track_id") String trackId, @InterfaceC30731q(name = "codec") String str, @InterfaceC30731q(name = "label") String str2, @InterfaceC30731q(name = "rid") String str3, @InterfaceC30731q(name = "track_type") String str4, @InterfaceC30731q(name = "metrics_order") List<String> list, @InterfaceC30731q(name = "metrics") Map<String, ? extends List<? extends List<Float>>> map, @InterfaceC30731q(name = "metrics_meta") Map<String, MetricDescriptor> map2, @InterfaceC30731q(name = "thresholds") Map<String, ? extends List<MetricThreshold>> map3) {
        AbstractC22676k.m65750j(trackId, "trackId");
        this.trackId = trackId;
        this.codec = str;
        this.label = str2;
        this.rid = str3;
        this.trackType = str4;
        this.metricsOrder = list;
        this.metrics = map;
        this.metricsMeta = map2;
        this.thresholds = map3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParticipantSeriesTrackMetrics copy$default(ParticipantSeriesTrackMetrics participantSeriesTrackMetrics, String str, String str2, String str3, String str4, String str5, List list, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = participantSeriesTrackMetrics.trackId;
        }
        if ((i13 & 2) != 0) {
            str2 = participantSeriesTrackMetrics.codec;
        }
        if ((i13 & 4) != 0) {
            str3 = participantSeriesTrackMetrics.label;
        }
        if ((i13 & 8) != 0) {
            str4 = participantSeriesTrackMetrics.rid;
        }
        if ((i13 & 16) != 0) {
            str5 = participantSeriesTrackMetrics.trackType;
        }
        if ((i13 & 32) != 0) {
            list = participantSeriesTrackMetrics.metricsOrder;
        }
        if ((i13 & 64) != 0) {
            map = participantSeriesTrackMetrics.metrics;
        }
        if ((i13 & 128) != 0) {
            map2 = participantSeriesTrackMetrics.metricsMeta;
        }
        if ((i13 & 256) != 0) {
            map3 = participantSeriesTrackMetrics.thresholds;
        }
        Map map4 = map2;
        Map map5 = map3;
        List list2 = list;
        Map map6 = map;
        String str6 = str5;
        String str7 = str3;
        return participantSeriesTrackMetrics.copy(str, str2, str7, str4, str6, list2, map6, map4, map5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRid() {
        return this.rid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTrackType() {
        return this.trackType;
    }

    public final List<String> component6() {
        return this.metricsOrder;
    }

    public final Map<String, List<List<Float>>> component7() {
        return this.metrics;
    }

    public final Map<String, MetricDescriptor> component8() {
        return this.metricsMeta;
    }

    public final Map<String, List<MetricThreshold>> component9() {
        return this.thresholds;
    }

    public final ParticipantSeriesTrackMetrics copy(@InterfaceC30731q(name = "track_id") String trackId, @InterfaceC30731q(name = "codec") String codec, @InterfaceC30731q(name = "label") String label, @InterfaceC30731q(name = "rid") String rid, @InterfaceC30731q(name = "track_type") String trackType, @InterfaceC30731q(name = "metrics_order") List<String> metricsOrder, @InterfaceC30731q(name = "metrics") Map<String, ? extends List<? extends List<Float>>> metrics, @InterfaceC30731q(name = "metrics_meta") Map<String, MetricDescriptor> metricsMeta, @InterfaceC30731q(name = "thresholds") Map<String, ? extends List<MetricThreshold>> thresholds) {
        AbstractC22676k.m65750j(trackId, "trackId");
        return new ParticipantSeriesTrackMetrics(trackId, codec, label, rid, trackType, metricsOrder, metrics, metricsMeta, thresholds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantSeriesTrackMetrics)) {
            return false;
        }
        ParticipantSeriesTrackMetrics participantSeriesTrackMetrics = (ParticipantSeriesTrackMetrics) other;
        return AbstractC22676k.m65745e(this.trackId, participantSeriesTrackMetrics.trackId) && AbstractC22676k.m65745e(this.codec, participantSeriesTrackMetrics.codec) && AbstractC22676k.m65745e(this.label, participantSeriesTrackMetrics.label) && AbstractC22676k.m65745e(this.rid, participantSeriesTrackMetrics.rid) && AbstractC22676k.m65745e(this.trackType, participantSeriesTrackMetrics.trackType) && AbstractC22676k.m65745e(this.metricsOrder, participantSeriesTrackMetrics.metricsOrder) && AbstractC22676k.m65745e(this.metrics, participantSeriesTrackMetrics.metrics) && AbstractC22676k.m65745e(this.metricsMeta, participantSeriesTrackMetrics.metricsMeta) && AbstractC22676k.m65745e(this.thresholds, participantSeriesTrackMetrics.thresholds);
    }

    public final String getCodec() {
        return this.codec;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Map<String, List<List<Float>>> getMetrics() {
        return this.metrics;
    }

    public final Map<String, MetricDescriptor> getMetricsMeta() {
        return this.metricsMeta;
    }

    public final List<String> getMetricsOrder() {
        return this.metricsOrder;
    }

    public final String getRid() {
        return this.rid;
    }

    public final Map<String, List<MetricThreshold>> getThresholds() {
        return this.thresholds;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final String getTrackType() {
        return this.trackType;
    }

    public int hashCode() {
        int iHashCode = this.trackId.hashCode() * 31;
        String str = this.codec;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rid;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.metricsOrder;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, List<List<Float>>> map = this.metrics;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, MetricDescriptor> map2 = this.metricsMeta;
        int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<MetricThreshold>> map3 = this.thresholds;
        return iHashCode8 + (map3 != null ? map3.hashCode() : 0);
    }

    public String toString() {
        String str = this.trackId;
        String str2 = this.codec;
        String str3 = this.label;
        String str4 = this.rid;
        String str5 = this.trackType;
        List<String> list = this.metricsOrder;
        Map<String, List<List<Float>>> map = this.metrics;
        Map<String, MetricDescriptor> map2 = this.metricsMeta;
        Map<String, List<MetricThreshold>> map3 = this.thresholds;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ParticipantSeriesTrackMetrics(trackId=", str, ", codec=", str2, ", label=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", rid=", str4, ", trackType=");
        AbstractC36095b.m114694v(str5, ", metricsOrder=", ", metrics=", sbM32001t, list);
        AbstractC3855a.m11840x(sbM32001t, map, ", metricsMeta=", map2, ", thresholds=");
        return AbstractC13673n.m38565l(sbM32001t, map3, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParticipantSeriesTrackMetrics(String str, String str2, String str3, String str4, String str5, List list, Map map, Map map2, Map map3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str2 = (i13 & 2) != 0 ? null : str2;
        str3 = (i13 & 4) != 0 ? null : str3;
        str4 = (i13 & 8) != 0 ? null : str4;
        str5 = (i13 & 16) != 0 ? null : str5;
        list = (i13 & 32) != 0 ? C25271y.f99162w : list;
        int i14 = i13 & 64;
        C25272z c25272z = C25272z.f99163w;
        this(str, str2, str3, str4, str5, list, i14 != 0 ? c25272z : map, (i13 & 128) != 0 ? c25272z : map2, (i13 & 256) != 0 ? c25272z : map3);
    }
}
