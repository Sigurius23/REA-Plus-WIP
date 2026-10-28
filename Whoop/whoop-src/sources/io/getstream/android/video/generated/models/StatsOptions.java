package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StatsOptions;", "", "enableRtcStats", "", "reportingIntervalMs", "", "(ZI)V", "getEnableRtcStats", "()Z", "getReportingIntervalMs", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class StatsOptions {
    private final boolean enableRtcStats;
    private final int reportingIntervalMs;

    public StatsOptions(@InterfaceC30731q(name = "enable_rtc_stats") boolean z4, @InterfaceC30731q(name = "reporting_interval_ms") int i13) {
        this.enableRtcStats = z4;
        this.reportingIntervalMs = i13;
    }

    public static /* synthetic */ StatsOptions copy$default(StatsOptions statsOptions, boolean z4, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z4 = statsOptions.enableRtcStats;
        }
        if ((i14 & 2) != 0) {
            i13 = statsOptions.reportingIntervalMs;
        }
        return statsOptions.copy(z4, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableRtcStats() {
        return this.enableRtcStats;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReportingIntervalMs() {
        return this.reportingIntervalMs;
    }

    public final StatsOptions copy(@InterfaceC30731q(name = "enable_rtc_stats") boolean enableRtcStats, @InterfaceC30731q(name = "reporting_interval_ms") int reportingIntervalMs) {
        return new StatsOptions(enableRtcStats, reportingIntervalMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsOptions)) {
            return false;
        }
        StatsOptions statsOptions = (StatsOptions) other;
        return this.enableRtcStats == statsOptions.enableRtcStats && this.reportingIntervalMs == statsOptions.reportingIntervalMs;
    }

    public final boolean getEnableRtcStats() {
        return this.enableRtcStats;
    }

    public final int getReportingIntervalMs() {
        return this.reportingIntervalMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.reportingIntervalMs) + (Boolean.hashCode(this.enableRtcStats) * 31);
    }

    public String toString() {
        return "StatsOptions(enableRtcStats=" + this.enableRtcStats + ", reportingIntervalMs=" + this.reportingIntervalMs + ")";
    }
}
