package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;", "", "averageConnectionTime", "", "averageJitter", "averageLatency", "averageTimeToReconnect", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getAverageConnectionTime", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAverageJitter", "getAverageLatency", "getAverageTimeToReconnect", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lio/getstream/android/video/generated/models/NetworkMetricsReportResponse;", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class NetworkMetricsReportResponse {
    private final Float averageConnectionTime;
    private final Float averageJitter;
    private final Float averageLatency;
    private final Float averageTimeToReconnect;

    public NetworkMetricsReportResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ NetworkMetricsReportResponse copy$default(NetworkMetricsReportResponse networkMetricsReportResponse, Float f13, Float f14, Float f15, Float f16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = networkMetricsReportResponse.averageConnectionTime;
        }
        if ((i13 & 2) != 0) {
            f14 = networkMetricsReportResponse.averageJitter;
        }
        if ((i13 & 4) != 0) {
            f15 = networkMetricsReportResponse.averageLatency;
        }
        if ((i13 & 8) != 0) {
            f16 = networkMetricsReportResponse.averageTimeToReconnect;
        }
        return networkMetricsReportResponse.copy(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getAverageConnectionTime() {
        return this.averageConnectionTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getAverageJitter() {
        return this.averageJitter;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getAverageLatency() {
        return this.averageLatency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getAverageTimeToReconnect() {
        return this.averageTimeToReconnect;
    }

    public final NetworkMetricsReportResponse copy(@InterfaceC30731q(name = "average_connection_time") Float averageConnectionTime, @InterfaceC30731q(name = "average_jitter") Float averageJitter, @InterfaceC30731q(name = "average_latency") Float averageLatency, @InterfaceC30731q(name = "average_time_to_reconnect") Float averageTimeToReconnect) {
        return new NetworkMetricsReportResponse(averageConnectionTime, averageJitter, averageLatency, averageTimeToReconnect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkMetricsReportResponse)) {
            return false;
        }
        NetworkMetricsReportResponse networkMetricsReportResponse = (NetworkMetricsReportResponse) other;
        return AbstractC22676k.m65745e(this.averageConnectionTime, networkMetricsReportResponse.averageConnectionTime) && AbstractC22676k.m65745e(this.averageJitter, networkMetricsReportResponse.averageJitter) && AbstractC22676k.m65745e(this.averageLatency, networkMetricsReportResponse.averageLatency) && AbstractC22676k.m65745e(this.averageTimeToReconnect, networkMetricsReportResponse.averageTimeToReconnect);
    }

    public final Float getAverageConnectionTime() {
        return this.averageConnectionTime;
    }

    public final Float getAverageJitter() {
        return this.averageJitter;
    }

    public final Float getAverageLatency() {
        return this.averageLatency;
    }

    public final Float getAverageTimeToReconnect() {
        return this.averageTimeToReconnect;
    }

    public int hashCode() {
        Float f13 = this.averageConnectionTime;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Float f14 = this.averageJitter;
        int iHashCode2 = (iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.averageLatency;
        int iHashCode3 = (iHashCode2 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.averageTimeToReconnect;
        return iHashCode3 + (f16 != null ? f16.hashCode() : 0);
    }

    public String toString() {
        return "NetworkMetricsReportResponse(averageConnectionTime=" + this.averageConnectionTime + ", averageJitter=" + this.averageJitter + ", averageLatency=" + this.averageLatency + ", averageTimeToReconnect=" + this.averageTimeToReconnect + ")";
    }

    public NetworkMetricsReportResponse(@InterfaceC30731q(name = "average_connection_time") Float f13, @InterfaceC30731q(name = "average_jitter") Float f14, @InterfaceC30731q(name = "average_latency") Float f15, @InterfaceC30731q(name = "average_time_to_reconnect") Float f16) {
        this.averageConnectionTime = f13;
        this.averageJitter = f14;
        this.averageLatency = f15;
        this.averageTimeToReconnect = f16;
    }

    public /* synthetic */ NetworkMetricsReportResponse(Float f13, Float f14, Float f15, Float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : f13, (i13 & 2) != 0 ? null : f14, (i13 & 4) != 0 ? null : f15, (i13 & 8) != 0 ? null : f16);
    }
}
