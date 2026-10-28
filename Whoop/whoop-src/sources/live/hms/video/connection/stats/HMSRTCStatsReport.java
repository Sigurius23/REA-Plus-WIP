package live.hms.video.connection.stats;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSRTCStatsReport;", "", "combined", "Llive/hms/video/connection/stats/HMSRTCStats;", "audio", "video", "<init>", "(Llive/hms/video/connection/stats/HMSRTCStats;Llive/hms/video/connection/stats/HMSRTCStats;Llive/hms/video/connection/stats/HMSRTCStats;)V", "getCombined", "()Llive/hms/video/connection/stats/HMSRTCStats;", "getAudio", "getVideo", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRTCStatsReport {
    private final HMSRTCStats audio;
    private final HMSRTCStats combined;
    private final HMSRTCStats video;

    public HMSRTCStatsReport(HMSRTCStats combined, HMSRTCStats audio, HMSRTCStats video) {
        AbstractC22676k.m65750j(combined, "combined");
        AbstractC22676k.m65750j(audio, "audio");
        AbstractC22676k.m65750j(video, "video");
        this.combined = combined;
        this.audio = audio;
        this.video = video;
    }

    public static /* synthetic */ HMSRTCStatsReport copy$default(HMSRTCStatsReport hMSRTCStatsReport, HMSRTCStats hMSRTCStats, HMSRTCStats hMSRTCStats2, HMSRTCStats hMSRTCStats3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSRTCStats = hMSRTCStatsReport.combined;
        }
        if ((i13 & 2) != 0) {
            hMSRTCStats2 = hMSRTCStatsReport.audio;
        }
        if ((i13 & 4) != 0) {
            hMSRTCStats3 = hMSRTCStatsReport.video;
        }
        return hMSRTCStatsReport.copy(hMSRTCStats, hMSRTCStats2, hMSRTCStats3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMSRTCStats getCombined() {
        return this.combined;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSRTCStats getAudio() {
        return this.audio;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSRTCStats getVideo() {
        return this.video;
    }

    public final HMSRTCStatsReport copy(HMSRTCStats combined, HMSRTCStats audio, HMSRTCStats video) {
        AbstractC22676k.m65750j(combined, "combined");
        AbstractC22676k.m65750j(audio, "audio");
        AbstractC22676k.m65750j(video, "video");
        return new HMSRTCStatsReport(combined, audio, video);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRTCStatsReport)) {
            return false;
        }
        HMSRTCStatsReport hMSRTCStatsReport = (HMSRTCStatsReport) other;
        return AbstractC22676k.m65745e(this.combined, hMSRTCStatsReport.combined) && AbstractC22676k.m65745e(this.audio, hMSRTCStatsReport.audio) && AbstractC22676k.m65745e(this.video, hMSRTCStatsReport.video);
    }

    public final HMSRTCStats getAudio() {
        return this.audio;
    }

    public final HMSRTCStats getCombined() {
        return this.combined;
    }

    public final HMSRTCStats getVideo() {
        return this.video;
    }

    public int hashCode() {
        return this.video.hashCode() + ((this.audio.hashCode() + (this.combined.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "HMSRTCStatsReport(combined=" + this.combined + ", audio=" + this.audio + ", video=" + this.video + ')';
    }
}
