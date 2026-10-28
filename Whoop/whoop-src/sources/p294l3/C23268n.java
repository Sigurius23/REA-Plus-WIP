package p294l3;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36780p;
import p636y3.C39169a;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C23268n {

    /* JADX INFO: renamed from: a */
    public final C23275q0 f92207a;

    public C23268n(C23275q0 c23275q0) {
        this.f92207a = c23275q0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23268n)) {
            return false;
        }
        C23275q0 c23275q0 = this.f92207a;
        C23254g c23254g = c23275q0.f92216a;
        C23275q0 c23275q1 = ((C23268n) obj).f92207a;
        return AbstractC22676k.m65745e(c23254g, c23275q1.f92216a) && c23275q0.f92217b.m67367d(c23275q1.f92217b) && AbstractC22676k.m65745e(c23275q0.f92218c, c23275q1.f92218c) && c23275q0.f92219d == c23275q1.f92219d && c23275q0.f92220e == c23275q1.f92220e && c23275q0.f92221f == c23275q1.f92221f && AbstractC22676k.m65745e(c23275q0.f92222g, c23275q1.f92222g) && c23275q0.f92223h == c23275q1.f92223h && c23275q0.f92224i == c23275q1.f92224i && C39169a.m124759c(c23275q0.f92225j, c23275q1.f92225j);
    }

    public final int hashCode() {
        C23275q0 c23275q0 = this.f92207a;
        int iHashCode = c23275q0.f92216a.hashCode() * 31;
        C23285v0 c23285v0 = c23275q0.f92217b;
        C23267m0 c23267m0 = c23285v0.f92255a;
        long j7 = c23267m0.f92192b;
        C39184p[] c39184pArr = C39183o.f168427b;
        int iHashCode2 = Long.hashCode(j7) * 31;
        C28780r c28780r = c23267m0.f92193c;
        int i13 = (iHashCode2 + (c28780r != null ? c28780r.f116547w : 0)) * 31;
        C28776n c28776n = c23267m0.f92194d;
        int iHashCode3 = (i13 + (c28776n != null ? Integer.hashCode(c28776n.f116535a) : 0)) * 31;
        C28777o c28777o = c23267m0.f92195e;
        int iHashCode4 = (iHashCode3 + (c28777o != null ? Integer.hashCode(c28777o.f116536a) : 0)) * 31;
        AbstractC28771i abstractC28771i = c23267m0.f92196f;
        int iHashCode5 = (iHashCode4 + (abstractC28771i != null ? abstractC28771i.hashCode() : 0)) * 31;
        String str = c23267m0.f92197g;
        int iM30451e = AbstractC11266d.m30451e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, c23267m0.f92198h, 31);
        C36765a c36765a = c23267m0.f92199i;
        int iHashCode6 = (iM30451e + (c36765a != null ? Float.hashCode(c36765a.f157332a) : 0)) * 31;
        C36780p c36780p = c23267m0.f92200j;
        int iHashCode7 = (iHashCode6 + (c36780p != null ? c36780p.hashCode() : 0)) * 31;
        C32096b c32096b = c23267m0.f92201k;
        int iHashCode8 = (iHashCode7 + (c32096b != null ? c32096b.f133099w.hashCode() : 0)) * 31;
        long j13 = c23267m0.f92202l;
        int i14 = C17919x.f69638o;
        int iM30451e2 = AbstractC11266d.m30451e(iHashCode8, j13, 31);
        C23253f0 c23253f0 = c23267m0.f92205o;
        int iHashCode9 = (c23285v0.f92256b.hashCode() + ((iM30451e2 + (c23253f0 != null ? c23253f0.hashCode() : 0)) * 31)) * 31;
        C23255g0 c23255g0 = c23285v0.f92257c;
        return Long.hashCode(c23275q0.f92225j) + ((c23275q0.f92224i.hashCode() + ((c23275q0.f92223h.hashCode() + ((c23275q0.f92222g.hashCode() + AbstractC11266d.m30448b(c23275q0.f92221f, AbstractC2875y.m8289b((AbstractC11895b.m31983b((iHashCode9 + (c23255g0 != null ? c23255g0.hashCode() : 0) + iHashCode) * 31, 31, c23275q0.f92218c) + c23275q0.f92219d) * 31, 31, c23275q0.f92220e), 31)) * 31)) * 31)) * 31);
    }
}
