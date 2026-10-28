package p350nw;

import java.io.Serializable;

/* JADX INFO: renamed from: nw.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C27187h implements Serializable {

    /* JADX INFO: renamed from: w */
    public final String f108835w;

    /* JADX INFO: renamed from: x */
    public static final C27187h f108832x = new C27187h("EC");

    /* JADX INFO: renamed from: y */
    public static final C27187h f108833y = new C27187h("RSA");

    /* JADX INFO: renamed from: z */
    public static final C27187h f108834z = new C27187h("oct");

    /* JADX INFO: renamed from: E */
    public static final C27187h f108831E = new C27187h("OKP");

    public C27187h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.f108835w = str;
    }

    /* JADX INFO: renamed from: a */
    public static C27187h m81772a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type to parse must not be null");
        }
        C27187h c27187h = f108832x;
        if (str.equals(c27187h.f108835w)) {
            return c27187h;
        }
        C27187h c27187h2 = f108833y;
        if (str.equals(c27187h2.f108835w)) {
            return c27187h2;
        }
        C27187h c27187h3 = f108834z;
        if (str.equals(c27187h3.f108835w)) {
            return c27187h3;
        }
        C27187h c27187h4 = f108831E;
        return str.equals(c27187h4.f108835w) ? c27187h4 : new C27187h(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27187h) {
            return this.f108835w.equals(((C27187h) obj).f108835w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f108835w.hashCode();
    }

    public final String toString() {
        return this.f108835w;
    }
}
