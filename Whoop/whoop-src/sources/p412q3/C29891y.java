package p412q3;

import j93.AbstractC21478l0;
import p000.AbstractC11266d;
import p02.C28589a;
import p294l3.C23254g;
import p294l3.C23283u0;
import p389p0.C28539n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pl0.C29343a;

/* JADX INFO: renamed from: q3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C29891y {

    /* JADX INFO: renamed from: d */
    public static final C28539n0 f122124d = new C28539n0(10, new C28589a(24), new C29343a(16));

    /* JADX INFO: renamed from: a */
    public final C23254g f122125a;

    /* JADX INFO: renamed from: b */
    public final long f122126b;

    /* JADX INFO: renamed from: c */
    public final C23283u0 f122127c;

    public C29891y(C23254g c23254g, long j7, C23283u0 c23283u0) {
        C23283u0 c23283u1;
        this.f122125a = c23254g;
        this.f122126b = AbstractC21478l0.m60444o(c23254g.f92135x.length(), j7);
        if (c23283u0 != null) {
            c23283u1 = new C23283u0(AbstractC21478l0.m60444o(c23254g.f92135x.length(), c23283u0.f92253a));
        } else {
            c23283u1 = null;
        }
        this.f122127c = c23283u1;
    }

    /* JADX INFO: renamed from: a */
    public static C29891y m91510a(C29891y c29891y, String str, long j7, int i13) {
        if ((i13 & 2) != 0) {
            j7 = c29891y.f122126b;
        }
        C23283u0 c23283u0 = c29891y.f122127c;
        c29891y.getClass();
        return new C29891y(new C23254g(str), j7, c23283u0);
    }

    /* JADX INFO: renamed from: b */
    public static C29891y m91511b(C29891y c29891y, C23254g c23254g, long j7, int i13) {
        if ((i13 & 1) != 0) {
            c23254g = c29891y.f122125a;
        }
        if ((i13 & 2) != 0) {
            j7 = c29891y.f122126b;
        }
        C23283u0 c23283u0 = (i13 & 4) != 0 ? c29891y.f122127c : null;
        c29891y.getClass();
        return new C29891y(c23254g, j7, c23283u0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29891y)) {
            return false;
        }
        C29891y c29891y = (C29891y) obj;
        return C23283u0.m67356b(this.f122126b, c29891y.f122126b) && AbstractC22676k.m65745e(this.f122127c, c29891y.f122127c) && AbstractC22676k.m65745e(this.f122125a, c29891y.f122125a);
    }

    public final int hashCode() {
        int iHashCode = this.f122125a.hashCode() * 31;
        int i13 = C23283u0.f92252c;
        int iM30451e = AbstractC11266d.m30451e(iHashCode, this.f122126b, 31);
        C23283u0 c23283u0 = this.f122127c;
        return iM30451e + (c23283u0 != null ? Long.hashCode(c23283u0.f92253a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f122125a) + "', selection=" + ((Object) C23283u0.m67362h(this.f122126b)) + ", composition=" + this.f122127c + ')';
    }

    public C29891y(int i13, String str, long j7) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C23283u0.f92251b : j7, (C23283u0) null);
    }

    public C29891y(String str, long j7, C23283u0 c23283u0) {
        this(new C23254g(str), j7, c23283u0);
    }
}
