package p031b9;

import java.util.Objects;
import p299l9.C23488c0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2862r0 {

    /* JADX INFO: renamed from: a */
    public final C23488c0 f11371a;

    /* JADX INFO: renamed from: b */
    public final long f11372b;

    /* JADX INFO: renamed from: c */
    public final long f11373c;

    /* JADX INFO: renamed from: d */
    public final long f11374d;

    /* JADX INFO: renamed from: e */
    public final long f11375e;

    /* JADX INFO: renamed from: f */
    public final boolean f11376f;

    /* JADX INFO: renamed from: g */
    public final boolean f11377g;

    /* JADX INFO: renamed from: h */
    public final boolean f11378h;

    /* JADX INFO: renamed from: i */
    public final boolean f11379i;

    /* JADX INFO: renamed from: j */
    public final boolean f11380j;

    public C2862r0(C23488c0 c23488c0, long j7, long j13, long j14, long j15, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16) {
        boolean z17 = true;
        AbstractC35849g.m113802d(!z16 || z14);
        AbstractC35849g.m113802d(!z15 || z14);
        if (z13 && (z14 || z15 || z16)) {
            z17 = false;
        }
        AbstractC35849g.m113802d(z17);
        this.f11371a = c23488c0;
        this.f11372b = j7;
        this.f11373c = j13;
        this.f11374d = j14;
        this.f11375e = j15;
        this.f11376f = z4;
        this.f11377g = z13;
        this.f11378h = z14;
        this.f11379i = z15;
        this.f11380j = z16;
    }

    /* JADX INFO: renamed from: a */
    public final C2862r0 m8263a(long j7) {
        if (j7 == this.f11373c) {
            return this;
        }
        return new C2862r0(this.f11371a, this.f11372b, j7, this.f11374d, this.f11375e, this.f11376f, this.f11377g, this.f11378h, this.f11379i, this.f11380j);
    }

    /* JADX INFO: renamed from: b */
    public final C2862r0 m8264b(long j7) {
        if (j7 == this.f11372b) {
            return this;
        }
        return new C2862r0(this.f11371a, j7, this.f11373c, this.f11374d, this.f11375e, this.f11376f, this.f11377g, this.f11378h, this.f11379i, this.f11380j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2862r0.class == obj.getClass()) {
            C2862r0 c2862r0 = (C2862r0) obj;
            if (this.f11372b == c2862r0.f11372b && this.f11373c == c2862r0.f11373c && this.f11374d == c2862r0.f11374d && this.f11375e == c2862r0.f11375e && this.f11376f == c2862r0.f11376f && this.f11377g == c2862r0.f11377g && this.f11378h == c2862r0.f11378h && this.f11379i == c2862r0.f11379i && this.f11380j == c2862r0.f11380j && Objects.equals(this.f11371a, c2862r0.f11371a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f11371a.hashCode() + 527) * 31) + ((int) this.f11372b)) * 31) + ((int) this.f11373c)) * 31) + ((int) this.f11374d)) * 31) + ((int) this.f11375e)) * 31) + (this.f11376f ? 1 : 0)) * 31) + (this.f11377g ? 1 : 0)) * 31) + (this.f11378h ? 1 : 0)) * 31) + (this.f11379i ? 1 : 0)) * 31) + (this.f11380j ? 1 : 0);
    }
}
