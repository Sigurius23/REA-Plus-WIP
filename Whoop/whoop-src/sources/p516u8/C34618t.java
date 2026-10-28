package p516u8;

import p141f9.C14278t;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C34618t {

    /* JADX INFO: renamed from: a */
    public final long f145827a;

    /* JADX INFO: renamed from: b */
    public final long f145828b;

    /* JADX INFO: renamed from: c */
    public final long f145829c;

    /* JADX INFO: renamed from: d */
    public final float f145830d;

    /* JADX INFO: renamed from: e */
    public final float f145831e;

    static {
        new C14278t().m40765b();
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(2);
        AbstractC38065t.m121892F(3);
        AbstractC38065t.m121892F(4);
    }

    public C34618t(C14278t c14278t) {
        long j7 = c14278t.f52132a;
        long j13 = c14278t.f52133b;
        long j14 = c14278t.f52134c;
        float f13 = c14278t.f52135d;
        float f14 = c14278t.f52136e;
        this.f145827a = j7;
        this.f145828b = j13;
        this.f145829c = j14;
        this.f145830d = f13;
        this.f145831e = f14;
    }

    /* JADX INFO: renamed from: a */
    public final C14278t m109415a() {
        C14278t c14278t = new C14278t();
        c14278t.f52132a = this.f145827a;
        c14278t.f52133b = this.f145828b;
        c14278t.f52134c = this.f145829c;
        c14278t.f52135d = this.f145830d;
        c14278t.f52136e = this.f145831e;
        return c14278t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34618t)) {
            return false;
        }
        C34618t c34618t = (C34618t) obj;
        return this.f145827a == c34618t.f145827a && this.f145828b == c34618t.f145828b && this.f145829c == c34618t.f145829c && this.f145830d == c34618t.f145830d && this.f145831e == c34618t.f145831e;
    }

    public final int hashCode() {
        long j7 = this.f145827a;
        long j13 = this.f145828b;
        int i13 = ((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f145829c;
        int i14 = (i13 + ((int) ((j14 >>> 32) ^ j14))) * 31;
        float f13 = this.f145830d;
        int iFloatToIntBits = (i14 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
        float f14 = this.f145831e;
        return iFloatToIntBits + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0);
    }
}
