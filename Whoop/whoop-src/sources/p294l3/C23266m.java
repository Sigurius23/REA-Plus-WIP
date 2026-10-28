package p294l3;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C23266m {

    /* JADX INFO: renamed from: a */
    public final C23264l f92188a;

    /* JADX INFO: renamed from: b */
    public final int f92189b;

    /* JADX INFO: renamed from: c */
    public final int f92190c;

    public C23266m(C23264l c23264l, int i13, int i14) {
        this.f92188a = c23264l;
        this.f92189b = i13;
        this.f92190c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23266m)) {
            return false;
        }
        C23266m c23266m = (C23266m) obj;
        return AbstractC22676k.m65745e(this.f92188a, c23266m.f92188a) && this.f92189b == c23266m.f92189b && this.f92190c == c23266m.f92190c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92190c) + AbstractC11266d.m30448b(this.f92189b, this.f92188a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb4.append(this.f92188a);
        sb4.append(", indentationLevel=");
        sb4.append(this.f92189b);
        sb4.append(", start=");
        return AbstractC11895b.m31999r(sb4, this.f92190c, ')');
    }
}
