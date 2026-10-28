package p281kj;

import p000.AbstractC11266d;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: kj.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C22512g {

    /* JADX INFO: renamed from: a */
    public final long f88231a;

    /* JADX INFO: renamed from: b */
    public final float f88232b;

    /* JADX INFO: renamed from: c */
    public final float f88233c;

    public C22512g(float f13, long j7, float f14) {
        this.f88231a = j7;
        this.f88232b = f13;
        this.f88233c = f14;
    }

    /* JADX INFO: renamed from: a */
    public final long m65012a() {
        return this.f88231a;
    }

    /* JADX INFO: renamed from: b */
    public final float m65013b() {
        return this.f88232b;
    }

    /* JADX INFO: renamed from: c */
    public final float m65014c() {
        return this.f88233c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22512g)) {
            return false;
        }
        C22512g c22512g = (C22512g) obj;
        return this.f88231a == c22512g.f88231a && Float.compare(this.f88232b, c22512g.f88232b) == 0 && Float.compare(this.f88233c, c22512g.f88233c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f88233c) + AbstractC11266d.m30447a(this.f88232b, Long.hashCode(this.f88231a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TapData(time=");
        sb4.append(this.f88231a);
        sb4.append(", x=");
        sb4.append(this.f88232b);
        sb4.append(", y=");
        return AbstractC30802r.m94763l(sb4, this.f88233c, ')');
    }
}
