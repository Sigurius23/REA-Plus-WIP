package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, m65681d2 = {"Llive/hms/video/sdk/models/role/SubscribeDegradationParams;", "", "packetLossThreshold", "", "degradeGracePeriodSeconds", "recoverGracePeriodSeconds", "<init>", "(JJJ)V", "getPacketLossThreshold", "()J", "getDegradeGracePeriodSeconds", "getRecoverGracePeriodSeconds", "isValid", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SubscribeDegradationParams {

    @SerializedName("degradeGracePeriodSeconds")
    private final long degradeGracePeriodSeconds;

    @SerializedName("packetLossThreshold")
    private final long packetLossThreshold;

    @SerializedName("recoverGracePeriodSeconds")
    private final long recoverGracePeriodSeconds;

    public SubscribeDegradationParams(long j7, long j13, long j14) {
        this.packetLossThreshold = j7;
        this.degradeGracePeriodSeconds = j13;
        this.recoverGracePeriodSeconds = j14;
    }

    public static /* synthetic */ SubscribeDegradationParams copy$default(SubscribeDegradationParams subscribeDegradationParams, long j7, long j13, long j14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = subscribeDegradationParams.packetLossThreshold;
        }
        long j15 = j7;
        if ((i13 & 2) != 0) {
            j13 = subscribeDegradationParams.degradeGracePeriodSeconds;
        }
        long j16 = j13;
        if ((i13 & 4) != 0) {
            j14 = subscribeDegradationParams.recoverGracePeriodSeconds;
        }
        return subscribeDegradationParams.copy(j15, j16, j14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPacketLossThreshold() {
        return this.packetLossThreshold;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDegradeGracePeriodSeconds() {
        return this.degradeGracePeriodSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRecoverGracePeriodSeconds() {
        return this.recoverGracePeriodSeconds;
    }

    public final SubscribeDegradationParams copy(long packetLossThreshold, long degradeGracePeriodSeconds, long recoverGracePeriodSeconds) {
        return new SubscribeDegradationParams(packetLossThreshold, degradeGracePeriodSeconds, recoverGracePeriodSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeDegradationParams)) {
            return false;
        }
        SubscribeDegradationParams subscribeDegradationParams = (SubscribeDegradationParams) other;
        return this.packetLossThreshold == subscribeDegradationParams.packetLossThreshold && this.degradeGracePeriodSeconds == subscribeDegradationParams.degradeGracePeriodSeconds && this.recoverGracePeriodSeconds == subscribeDegradationParams.recoverGracePeriodSeconds;
    }

    public final long getDegradeGracePeriodSeconds() {
        return this.degradeGracePeriodSeconds;
    }

    public final long getPacketLossThreshold() {
        return this.packetLossThreshold;
    }

    public final long getRecoverGracePeriodSeconds() {
        return this.recoverGracePeriodSeconds;
    }

    public int hashCode() {
        return Long.hashCode(this.recoverGracePeriodSeconds) + AbstractC11266d.m30451e(Long.hashCode(this.packetLossThreshold) * 31, this.degradeGracePeriodSeconds, 31);
    }

    public final boolean isValid() {
        return (this.packetLossThreshold == 0 || this.degradeGracePeriodSeconds == 0 || this.recoverGracePeriodSeconds == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SubscribeDegradationParams(packetLossThreshold=");
        sb4.append(this.packetLossThreshold);
        sb4.append(", degradeGracePeriodSeconds=");
        sb4.append(this.degradeGracePeriodSeconds);
        sb4.append(", recoverGracePeriodSeconds=");
        return AbstractC2875y.m8302o(sb4, this.recoverGracePeriodSeconds, ')');
    }
}
