package t23;

import n33.C26243q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33460u0 {

    /* JADX INFO: renamed from: a */
    public final C26243q f139718a;

    /* JADX INFO: renamed from: b */
    public final C26243q f139719b;

    /* JADX INFO: renamed from: c */
    public final C33451s1 f139720c;

    /* JADX INFO: renamed from: d */
    public final C33455t0 f139721d;

    public C33460u0(C26243q c26243q, C26243q c26243q2, C33451s1 c33451s1, C33455t0 stateStats) {
        AbstractC22676k.m65750j(stateStats, "stateStats");
        this.f139718a = c26243q;
        this.f139719b = c26243q2;
        this.f139720c = c33451s1;
        this.f139721d = stateStats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33460u0)) {
            return false;
        }
        C33460u0 c33460u0 = (C33460u0) obj;
        return AbstractC22676k.m65745e(this.f139718a, c33460u0.f139718a) && AbstractC22676k.m65745e(this.f139719b, c33460u0.f139719b) && AbstractC22676k.m65745e(this.f139720c, c33460u0.f139720c) && AbstractC22676k.m65745e(this.f139721d, c33460u0.f139721d);
    }

    public final int hashCode() {
        C26243q c26243q = this.f139718a;
        int iHashCode = (c26243q == null ? 0 : c26243q.hashCode()) * 31;
        C26243q c26243q2 = this.f139719b;
        int iHashCode2 = (iHashCode + (c26243q2 == null ? 0 : c26243q2.hashCode())) * 31;
        C33451s1 c33451s1 = this.f139720c;
        return this.f139721d.hashCode() + ((iHashCode2 + (c33451s1 != null ? c33451s1.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CallStatsReport(publisher=" + this.f139718a + ", subscriber=" + this.f139719b + ", local=" + this.f139720c + ", stateStats=" + this.f139721d + ")";
    }
}
