package h33;

import c13.AbstractC3855a;
import java.util.LinkedHashMap;
import java.util.List;
import org.webrtc.RTCStatsReport;

/* JADX INFO: renamed from: h33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C16831a {

    /* JADX INFO: renamed from: a */
    public final RTCStatsReport f64689a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f64690b;

    /* JADX INFO: renamed from: c */
    public final List f64691c;

    public C16831a(RTCStatsReport rTCStatsReport, LinkedHashMap linkedHashMap, List list) {
        this.f64689a = rTCStatsReport;
        this.f64690b = linkedHashMap;
        this.f64691c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16831a)) {
            return false;
        }
        C16831a c16831a = (C16831a) obj;
        return this.f64689a.equals(c16831a.f64689a) && this.f64690b.equals(c16831a.f64690b) && this.f64691c.equals(c16831a.f64691c);
    }

    public final int hashCode() {
        return this.f64691c.hashCode() + ((this.f64690b.hashCode() + (this.f64689a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ComputedStats(stats=");
        sb4.append(this.f64689a);
        sb4.append(", delta=");
        sb4.append(this.f64690b);
        sb4.append(", performanceStats=");
        return AbstractC3855a.m11829m(sb4, this.f64691c, ")");
    }
}
