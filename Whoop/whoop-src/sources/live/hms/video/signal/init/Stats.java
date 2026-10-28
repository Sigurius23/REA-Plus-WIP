package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/signal/init/Stats;", "", "maxSampleWindowSize", "", "maxSamplePushInterval", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getMaxSampleWindowSize", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMaxSamplePushInterval", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Llive/hms/video/signal/init/Stats;", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Stats {

    @SerializedName("maxSamplePushInterval")
    private final Float maxSamplePushInterval;

    @SerializedName("maxSampleWindowSize")
    private final Float maxSampleWindowSize;

    public Stats(Float f13, Float f14) {
        this.maxSampleWindowSize = f13;
        this.maxSamplePushInterval = f14;
    }

    public static /* synthetic */ Stats copy$default(Stats stats, Float f13, Float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = stats.maxSampleWindowSize;
        }
        if ((i13 & 2) != 0) {
            f14 = stats.maxSamplePushInterval;
        }
        return stats.copy(f13, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getMaxSampleWindowSize() {
        return this.maxSampleWindowSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getMaxSamplePushInterval() {
        return this.maxSamplePushInterval;
    }

    public final Stats copy(Float maxSampleWindowSize, Float maxSamplePushInterval) {
        return new Stats(maxSampleWindowSize, maxSamplePushInterval);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stats)) {
            return false;
        }
        Stats stats = (Stats) other;
        return AbstractC22676k.m65745e(this.maxSampleWindowSize, stats.maxSampleWindowSize) && AbstractC22676k.m65745e(this.maxSamplePushInterval, stats.maxSamplePushInterval);
    }

    public final Float getMaxSamplePushInterval() {
        return this.maxSamplePushInterval;
    }

    public final Float getMaxSampleWindowSize() {
        return this.maxSampleWindowSize;
    }

    public int hashCode() {
        Float f13 = this.maxSampleWindowSize;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Float f14 = this.maxSamplePushInterval;
        return iHashCode + (f14 != null ? f14.hashCode() : 0);
    }

    public String toString() {
        return "Stats(maxSampleWindowSize=" + this.maxSampleWindowSize + ", maxSamplePushInterval=" + this.maxSamplePushInterval + ')';
    }
}
