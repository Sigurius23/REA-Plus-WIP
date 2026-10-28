package n33;

import java.util.HashMap;
import org.webrtc.RTCStatsReport;

/* JADX INFO: renamed from: n33.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C26243q {

    /* JADX INFO: renamed from: a */
    public final RTCStatsReport f104348a;

    /* JADX INFO: renamed from: b */
    public final HashMap f104349b;

    public C26243q(RTCStatsReport rTCStatsReport, HashMap map) {
        this.f104348a = rTCStatsReport;
        this.f104349b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26243q)) {
            return false;
        }
        C26243q c26243q = (C26243q) obj;
        return this.f104348a.equals(c26243q.f104348a) && this.f104349b.equals(c26243q.f104349b);
    }

    public final int hashCode() {
        return this.f104349b.hashCode() + (this.f104348a.hashCode() * 31);
    }

    public final String toString() {
        return "RtcStatsReport(origin=" + this.f104348a + ", parsed=" + this.f104349b + ")";
    }
}
