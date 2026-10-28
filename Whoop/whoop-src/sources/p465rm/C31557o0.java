package p465rm;

import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import sn.C32763v;

/* JADX INFO: renamed from: rm.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31557o0 {

    /* JADX INFO: renamed from: a */
    public final C32763v f130326a;

    /* JADX INFO: renamed from: b */
    public final long f130327b;

    /* JADX INFO: renamed from: c */
    public final long f130328c;

    /* JADX INFO: renamed from: d */
    public final long f130329d;

    /* JADX INFO: renamed from: e */
    public final long f130330e;

    /* JADX INFO: renamed from: f */
    public final boolean f130331f;

    /* JADX INFO: renamed from: g */
    public final boolean f130332g;

    /* JADX INFO: renamed from: h */
    public final boolean f130333h;

    /* JADX INFO: renamed from: i */
    public final boolean f130334i;

    public C31557o0(C32763v c32763v, long j7, long j13, long j14, long j15, boolean z4, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        AbstractC24543a.m71569e(!z15 || z13);
        AbstractC24543a.m71569e(!z14 || z13);
        if (z4 && (z13 || z14 || z15)) {
            z16 = false;
        }
        AbstractC24543a.m71569e(z16);
        this.f130326a = c32763v;
        this.f130327b = j7;
        this.f130328c = j13;
        this.f130329d = j14;
        this.f130330e = j15;
        this.f130331f = z4;
        this.f130332g = z13;
        this.f130333h = z14;
        this.f130334i = z15;
    }

    /* JADX INFO: renamed from: a */
    public final C31557o0 m97169a(long j7) {
        if (j7 == this.f130328c) {
            return this;
        }
        return new C31557o0(this.f130326a, this.f130327b, j7, this.f130329d, this.f130330e, this.f130331f, this.f130332g, this.f130333h, this.f130334i);
    }

    /* JADX INFO: renamed from: b */
    public final C31557o0 m97170b(long j7) {
        if (j7 == this.f130327b) {
            return this;
        }
        return new C31557o0(this.f130326a, j7, this.f130328c, this.f130329d, this.f130330e, this.f130331f, this.f130332g, this.f130333h, this.f130334i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31557o0.class == obj.getClass()) {
            C31557o0 c31557o0 = (C31557o0) obj;
            if (this.f130327b == c31557o0.f130327b && this.f130328c == c31557o0.f130328c && this.f130329d == c31557o0.f130329d && this.f130330e == c31557o0.f130330e && this.f130331f == c31557o0.f130331f && this.f130332g == c31557o0.f130332g && this.f130333h == c31557o0.f130333h && this.f130334i == c31557o0.f130334i && AbstractC24567y.m71670a(this.f130326a, c31557o0.f130326a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f130326a.hashCode() + 527) * 31) + ((int) this.f130327b)) * 31) + ((int) this.f130328c)) * 31) + ((int) this.f130329d)) * 31) + ((int) this.f130330e)) * 31) + (this.f130331f ? 1 : 0)) * 31) + (this.f130332g ? 1 : 0)) * 31) + (this.f130333h ? 1 : 0)) * 31) + (this.f130334i ? 1 : 0);
    }
}
