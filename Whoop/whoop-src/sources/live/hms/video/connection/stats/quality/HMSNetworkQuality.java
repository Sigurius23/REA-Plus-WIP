package live.hms.video.connection.stats.quality;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/connection/stats/quality/HMSNetworkQuality;", "", "downlinkQuality", "", "<init>", "(I)V", "getDownlinkQuality", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSNetworkQuality {
    private final int downlinkQuality;

    public HMSNetworkQuality(int i13) {
        this.downlinkQuality = i13;
    }

    public static /* synthetic */ HMSNetworkQuality copy$default(HMSNetworkQuality hMSNetworkQuality, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = hMSNetworkQuality.downlinkQuality;
        }
        return hMSNetworkQuality.copy(i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDownlinkQuality() {
        return this.downlinkQuality;
    }

    public final HMSNetworkQuality copy(int downlinkQuality) {
        return new HMSNetworkQuality(downlinkQuality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HMSNetworkQuality) && this.downlinkQuality == ((HMSNetworkQuality) other).downlinkQuality;
    }

    public final int getDownlinkQuality() {
        return this.downlinkQuality;
    }

    public int hashCode() {
        return Integer.hashCode(this.downlinkQuality);
    }

    public String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("HMSNetworkQuality(downlinkQuality="), this.downlinkQuality, ')');
    }
}
