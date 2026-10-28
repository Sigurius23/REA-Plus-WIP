package p294l3;

import p000.AbstractC11266d;
import p270k2.C22134h;
import p636y3.C39183o;
import p636y3.C39184p;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: l3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C23264l implements InterfaceC23244b {

    /* JADX INFO: renamed from: d */
    public static final long f92160d = AbstractC35745c.m113248j(1, 8589934592L);

    /* JADX INFO: renamed from: e */
    public static final C23264l f92161e;

    /* JADX INFO: renamed from: a */
    public final long f92162a;

    /* JADX INFO: renamed from: b */
    public final long f92163b;

    /* JADX INFO: renamed from: c */
    public final long f92164c;

    static {
        long jM113244f = AbstractC35745c.m113244f(0.25d);
        f92161e = new C23264l(jM113244f, jM113244f, AbstractC35745c.m113244f(0.25d));
    }

    public C23264l(long j7, long j13, long j14) {
        this.f92162a = j7;
        this.f92163b = j13;
        this.f92164c = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C23264l)) {
            return false;
        }
        C23264l c23264l = (C23264l) obj;
        Object obj2 = C23270o.f92212a;
        if (!obj2.equals(obj2) || !C39183o.m124803a(this.f92162a, c23264l.f92162a) || !C39183o.m124803a(this.f92163b, c23264l.f92163b)) {
            return false;
        }
        C39183o.m124803a(this.f92164c, c23264l.f92164c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = C23270o.f92212a.hashCode() * 31;
        C39184p[] c39184pArr = C39183o.f168427b;
        return C22134h.f85857a.hashCode() + AbstractC11266d.m30447a(Float.NaN, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(iHashCode, this.f92162a, 31), this.f92163b, 31), this.f92164c, 961), 31);
    }

    public final String toString() {
        return "Bullet(shape=" + C23270o.f92212a + ", size=(" + ((Object) C39183o.m124807e(this.f92162a)) + ", " + ((Object) C39183o.m124807e(this.f92163b)) + "), padding=" + ((Object) C39183o.m124807e(this.f92164c)) + ", brush=null, alpha=NaN, drawStyle=" + C22134h.f85857a + ')';
    }
}
