package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/signal/init/RangeLimits;", "", "low", "", "high", "<init>", "(JJ)V", "getLow", "()J", "getHigh", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class RangeLimits {

    @SerializedName("high")
    private final long high;

    @SerializedName("low")
    private final long low;

    public RangeLimits(long j7, long j13) {
        this.low = j7;
        this.high = j13;
    }

    public static /* synthetic */ RangeLimits copy$default(RangeLimits rangeLimits, long j7, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = rangeLimits.low;
        }
        if ((i13 & 2) != 0) {
            j13 = rangeLimits.high;
        }
        return rangeLimits.copy(j7, j13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getHigh() {
        return this.high;
    }

    public final RangeLimits copy(long low, long high) {
        return new RangeLimits(low, high);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeLimits)) {
            return false;
        }
        RangeLimits rangeLimits = (RangeLimits) other;
        return this.low == rangeLimits.low && this.high == rangeLimits.high;
    }

    public final long getHigh() {
        return this.high;
    }

    public final long getLow() {
        return this.low;
    }

    public int hashCode() {
        return Long.hashCode(this.high) + (Long.hashCode(this.low) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("RangeLimits(low=");
        sb4.append(this.low);
        sb4.append(", high=");
        return AbstractC2875y.m8302o(sb4, this.high, ')');
    }
}
