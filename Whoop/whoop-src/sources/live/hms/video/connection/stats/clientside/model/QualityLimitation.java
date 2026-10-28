package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC30802r;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/QualityLimitation;", "", "bandwidthMs", "", "cpuMs", "<init>", "(FF)V", "getBandwidthMs", "()F", "getCpuMs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class QualityLimitation {

    @SerializedName("bandwidth_sec")
    private final float bandwidthMs;

    @SerializedName("cpu_sec")
    private final float cpuMs;

    public QualityLimitation(float f13, float f14) {
        this.bandwidthMs = f13;
        this.cpuMs = f14;
    }

    public static /* synthetic */ QualityLimitation copy$default(QualityLimitation qualityLimitation, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = qualityLimitation.bandwidthMs;
        }
        if ((i13 & 2) != 0) {
            f14 = qualityLimitation.cpuMs;
        }
        return qualityLimitation.copy(f13, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getBandwidthMs() {
        return this.bandwidthMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getCpuMs() {
        return this.cpuMs;
    }

    public final QualityLimitation copy(float bandwidthMs, float cpuMs) {
        return new QualityLimitation(bandwidthMs, cpuMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QualityLimitation)) {
            return false;
        }
        QualityLimitation qualityLimitation = (QualityLimitation) other;
        return Float.compare(this.bandwidthMs, qualityLimitation.bandwidthMs) == 0 && Float.compare(this.cpuMs, qualityLimitation.cpuMs) == 0;
    }

    public final float getBandwidthMs() {
        return this.bandwidthMs;
    }

    public final float getCpuMs() {
        return this.cpuMs;
    }

    public int hashCode() {
        return Float.hashCode(this.cpuMs) + (Float.hashCode(this.bandwidthMs) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("QualityLimitation(bandwidthMs=");
        sb4.append(this.bandwidthMs);
        sb4.append(", cpuMs=");
        return AbstractC30802r.m94763l(sb4, this.cpuMs, ')');
    }
}
