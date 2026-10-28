package p505ts;

import ih0.AbstractC18489d0;
import java.util.Objects;
import p347ns.AbstractC27099t;
import p389p0.C28539n0;

/* JADX INFO: renamed from: ts.k */
/* JADX INFO: loaded from: classes.dex */
public final class C34128k extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final int f143066a;

    /* JADX INFO: renamed from: b */
    public final C34124g f143067b;

    public C34128k(int i13, C34124g c34124g) {
        this.f143066a = i13;
        this.f143067b = c34124g;
    }

    /* JADX INFO: renamed from: b */
    public static C28539n0 m107855b() {
        C28539n0 c28539n0 = new C28539n0(6);
        c28539n0.f115462x = null;
        c28539n0.f115463y = null;
        return c28539n0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34128k)) {
            return false;
        }
        C34128k c34128k = (C34128k) obj;
        return c34128k.f143066a == this.f143066a && c34128k.f143067b == this.f143067b;
    }

    public final int hashCode() {
        return Objects.hash(C34128k.class, Integer.valueOf(this.f143066a), this.f143067b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HMAC PRF Parameters (hashType: ");
        sb4.append(this.f143067b);
        sb4.append(" and ");
        return AbstractC18489d0.m53371l(sb4, this.f143066a, "-byte key)");
    }
}
