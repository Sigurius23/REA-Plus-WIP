package aa3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0615e1 {

    /* JADX INFO: renamed from: c */
    public static final C0615e1 f2174c = new C0615e1(null, null);

    /* JADX INFO: renamed from: a */
    public final EnumC0621g1 f2175a;

    /* JADX INFO: renamed from: b */
    public final C0606b1 f2176b;

    public C0615e1(EnumC0621g1 enumC0621g1, C0606b1 c0606b1) {
        this.f2175a = enumC0621g1;
        this.f2176b = c0606b1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0615e1)) {
            return false;
        }
        C0615e1 c0615e1 = (C0615e1) obj;
        return this.f2175a == c0615e1.f2175a && AbstractC22676k.m65745e(this.f2176b, c0615e1.f2176b);
    }

    public final int hashCode() {
        EnumC0621g1 enumC0621g1 = this.f2175a;
        int iHashCode = (enumC0621g1 == null ? 0 : enumC0621g1.hashCode()) * 31;
        C0606b1 c0606b1 = this.f2176b;
        return iHashCode + (c0606b1 != null ? c0606b1.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f2175a + ", type=" + this.f2176b + ')';
    }
}
