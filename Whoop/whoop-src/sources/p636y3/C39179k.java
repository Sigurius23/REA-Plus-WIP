package p636y3;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: y3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C39179k {

    /* JADX INFO: renamed from: e */
    public static final C39179k f168417e = new C39179k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f168418a;

    /* JADX INFO: renamed from: b */
    public final int f168419b;

    /* JADX INFO: renamed from: c */
    public final int f168420c;

    /* JADX INFO: renamed from: d */
    public final int f168421d;

    public C39179k(int i13, int i14, int i15, int i16) {
        this.f168418a = i13;
        this.f168419b = i14;
        this.f168420c = i15;
        this.f168421d = i16;
    }

    /* JADX INFO: renamed from: a */
    public final int m124796a() {
        return this.f168421d - this.f168419b;
    }

    /* JADX INFO: renamed from: b */
    public final long m124797b() {
        return (((long) this.f168418a) << 32) | (((long) this.f168419b) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public final int m124798c() {
        return this.f168420c - this.f168418a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39179k)) {
            return false;
        }
        C39179k c39179k = (C39179k) obj;
        return this.f168418a == c39179k.f168418a && this.f168419b == c39179k.f168419b && this.f168420c == c39179k.f168420c && this.f168421d == c39179k.f168421d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168421d) + AbstractC11266d.m30448b(this.f168420c, AbstractC11266d.m30448b(this.f168419b, Integer.hashCode(this.f168418a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IntRect.fromLTRB(");
        sb4.append(this.f168418a);
        sb4.append(", ");
        sb4.append(this.f168419b);
        sb4.append(", ");
        sb4.append(this.f168420c);
        sb4.append(", ");
        return AbstractC11895b.m31999r(sb4, this.f168421d, ')');
    }
}
