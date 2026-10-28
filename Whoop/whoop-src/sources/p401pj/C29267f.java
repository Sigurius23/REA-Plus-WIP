package p401pj;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pj.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C29267f {

    /* JADX INFO: renamed from: a */
    public final Number f118439a;

    /* JADX INFO: renamed from: b */
    public final Number f118440b;

    public C29267f(Number number, Number number2) {
        this.f118439a = number;
        this.f118440b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29267f)) {
            return false;
        }
        C29267f c29267f = (C29267f) obj;
        return AbstractC22676k.m65745e(this.f118439a, c29267f.f118439a) && AbstractC22676k.m65745e(this.f118440b, c29267f.f118440b);
    }

    public final int hashCode() {
        Number number = this.f118439a;
        int iHashCode = (number == null ? 0 : number.hashCode()) * 31;
        Number number2 = this.f118440b;
        return iHashCode + (number2 != null ? number2.hashCode() : 0);
    }

    public final String toString() {
        return "Coords(x=" + this.f118439a + ", y=" + this.f118440b + ')';
    }
}
