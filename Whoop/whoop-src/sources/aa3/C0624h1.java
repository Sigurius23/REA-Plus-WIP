package aa3;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: aa3.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0624h1 {

    /* JADX INFO: renamed from: a */
    public final int f2189a;

    /* JADX INFO: renamed from: b */
    public final int f2190b;

    /* JADX INFO: renamed from: c */
    public final int f2191c;

    public C0624h1(int i13, int i14, int i15) {
        this.f2189a = i13;
        this.f2190b = i14;
        this.f2191c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0624h1)) {
            return false;
        }
        C0624h1 c0624h1 = (C0624h1) obj;
        return this.f2189a == c0624h1.f2189a && this.f2190b == c0624h1.f2190b && this.f2191c == c0624h1.f2191c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2191c) + AbstractC11266d.m30448b(this.f2190b, Integer.hashCode(this.f2189a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2189a);
        sb4.append('.');
        sb4.append(this.f2190b);
        sb4.append('.');
        sb4.append(this.f2191c);
        return sb4.toString();
    }
}
