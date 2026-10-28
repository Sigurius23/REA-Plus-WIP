package p299l9;

import te0.AbstractC33745d;

/* JADX INFO: renamed from: l9.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23488c0 {

    /* JADX INFO: renamed from: a */
    public final Object f92976a;

    /* JADX INFO: renamed from: b */
    public final int f92977b;

    /* JADX INFO: renamed from: c */
    public final int f92978c;

    /* JADX INFO: renamed from: d */
    public final long f92979d;

    /* JADX INFO: renamed from: e */
    public final int f92980e;

    public C23488c0(Object obj) {
        this(obj, -1L);
    }

    /* JADX INFO: renamed from: a */
    public final C23488c0 m68053a(Object obj) {
        if (this.f92976a.equals(obj)) {
            return this;
        }
        long j7 = this.f92979d;
        return new C23488c0(this.f92977b, this.f92978c, this.f92980e, j7, obj);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m68054b() {
        return this.f92977b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23488c0)) {
            return false;
        }
        C23488c0 c23488c0 = (C23488c0) obj;
        return this.f92976a.equals(c23488c0.f92976a) && this.f92977b == c23488c0.f92977b && this.f92978c == c23488c0.f92978c && this.f92979d == c23488c0.f92979d && this.f92980e == c23488c0.f92980e;
    }

    public final int hashCode() {
        return ((((((AbstractC33745d.m106644c(527, 31, this.f92976a) + this.f92977b) * 31) + this.f92978c) * 31) + ((int) this.f92979d)) * 31) + this.f92980e;
    }

    public C23488c0(Object obj, long j7) {
        this(-1, -1, -1, j7, obj);
    }

    public C23488c0(Object obj, long j7, int i13) {
        this(-1, -1, i13, j7, obj);
    }

    public C23488c0(int i13, int i14, int i15, long j7, Object obj) {
        this.f92976a = obj;
        this.f92977b = i13;
        this.f92978c = i14;
        this.f92979d = j7;
        this.f92980e = i15;
    }
}
