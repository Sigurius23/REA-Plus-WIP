package dm;

import au.C2049f;

/* JADX INFO: renamed from: dm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12171a {

    /* JADX INFO: renamed from: a */
    public final C2049f f40475a;

    /* JADX INFO: renamed from: b */
    public final C12172b f40476b;

    public C12171a(C2049f c2049f, C12172b c12172b) {
        this.f40475a = c2049f;
        this.f40476b = c12172b;
    }

    /* JADX INFO: renamed from: a */
    public static C12171a m33677a(C2049f c2049f, C12172b c12172b) {
        return new C12171a(c2049f, c12172b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12171a)) {
            return false;
        }
        C12171a c12171a = (C12171a) obj;
        C12172b c12172b = c12171a.f40476b;
        if (!this.f40475a.equals(c12171a.f40475a)) {
            return false;
        }
        Object obj2 = EnumC12174d.f40479w;
        return obj2.equals(obj2) && this.f40476b.equals(c12172b);
    }

    public final int hashCode() {
        return this.f40476b.hashCode() ^ (((((1000003 * 1000003) ^ this.f40475a.hashCode()) * 1000003) ^ EnumC12174d.f40479w.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f40475a + ", priority=" + EnumC12174d.f40479w + ", productData=" + this.f40476b + "}";
    }
}
