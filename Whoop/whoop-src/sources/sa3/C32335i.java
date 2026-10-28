package sa3;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: sa3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C32335i {

    /* JADX INFO: renamed from: d */
    public static final C32335i f133833d = new C32335i(256, 256, 256);

    /* JADX INFO: renamed from: a */
    public final int f133834a;

    /* JADX INFO: renamed from: b */
    public final int f133835b;

    /* JADX INFO: renamed from: c */
    public final int f133836c;

    public C32335i(int i13, int i14, int i15) {
        this.f133834a = i13;
        this.f133835b = i14;
        this.f133836c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32335i)) {
            return false;
        }
        C32335i c32335i = (C32335i) obj;
        return this.f133834a == c32335i.f133834a && this.f133835b == c32335i.f133835b && this.f133836c == c32335i.f133836c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133836c) + AbstractC11266d.m30448b(this.f133835b, Integer.hashCode(this.f133834a) * 31, 31);
    }

    public final String toString() {
        int i13 = this.f133835b;
        int i14 = this.f133834a;
        int i15 = this.f133836c;
        if (i15 == 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i14);
            sb4.append('.');
            sb4.append(i13);
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(i14);
        sb5.append('.');
        sb5.append(i13);
        sb5.append('.');
        sb5.append(i15);
        return sb5.toString();
    }
}
