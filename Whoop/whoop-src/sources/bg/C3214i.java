package bg;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: bg.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C3214i {

    /* JADX INFO: renamed from: a */
    public int f12572a = 0;

    /* JADX INFO: renamed from: b */
    public int f12573b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3214i)) {
            return false;
        }
        C3214i c3214i = (C3214i) obj;
        return this.f12572a == c3214i.f12572a && this.f12573b == c3214i.f12573b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12573b) + (Integer.hashCode(this.f12572a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Span(start=");
        sb4.append(this.f12572a);
        sb4.append(", len=");
        return AbstractC11895b.m31999r(sb4, this.f12573b, ')');
    }
}
