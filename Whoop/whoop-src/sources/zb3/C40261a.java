package zb3;

import java.io.Serializable;
import p477s2.AbstractC32069a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: zb3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40261a implements Comparable, Serializable {

    /* JADX INFO: renamed from: y */
    public static final C40261a f174164y = new C40261a(0, 0);

    /* JADX INFO: renamed from: w */
    public final long f174165w;

    /* JADX INFO: renamed from: x */
    public final long f174166x;

    public C40261a(long j7, long j13) {
        this.f174165w = j7;
        this.f174166x = j13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C40261a other = (C40261a) obj;
        AbstractC22676k.m65750j(other, "other");
        long j7 = other.f174165w;
        long j13 = this.f174165w;
        return j13 != j7 ? Long.compareUnsigned(j13, j7) : Long.compareUnsigned(this.f174166x, other.f174166x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40261a)) {
            return false;
        }
        C40261a c40261a = (C40261a) obj;
        return this.f174165w == c40261a.f174165w && this.f174166x == c40261a.f174166x;
    }

    public final int hashCode() {
        return Long.hashCode(this.f174165w ^ this.f174166x);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC32069a.m99670h(this.f174165w, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC32069a.m99670h(this.f174165w, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC32069a.m99670h(this.f174165w, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC32069a.m99670h(this.f174166x, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC32069a.m99670h(this.f174166x, bArr, 24, 2, 8);
        return AbstractC39421y.m125916A(bArr);
    }
}
