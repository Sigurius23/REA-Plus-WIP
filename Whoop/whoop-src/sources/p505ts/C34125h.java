package p505ts;

import ih0.AbstractC18489d0;
import java.util.Objects;
import p075ct.C11105a;
import p347ns.AbstractC27099t;
import p474s.C31983m2;

/* JADX INFO: renamed from: ts.h */
/* JADX INFO: loaded from: classes.dex */
public final class C34125h extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final int f143056a;

    /* JADX INFO: renamed from: b */
    public final C34124g f143057b;

    /* JADX INFO: renamed from: c */
    public final C11105a f143058c;

    public C34125h(int i13, C34124g c34124g, C11105a c11105a) {
        this.f143056a = i13;
        this.f143057b = c34124g;
        this.f143058c = c11105a;
    }

    /* JADX INFO: renamed from: b */
    public static C31983m2 m107854b() {
        C31983m2 c31983m2 = new C31983m2();
        c31983m2.f132768w = null;
        c31983m2.f132769x = null;
        c31983m2.f132770y = null;
        return c31983m2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34125h)) {
            return false;
        }
        C34125h c34125h = (C34125h) obj;
        return c34125h.f143056a == this.f143056a && c34125h.f143057b == this.f143057b && Objects.equals(c34125h.f143058c, this.f143058c);
    }

    public final int hashCode() {
        return Objects.hash(C34125h.class, Integer.valueOf(this.f143056a), this.f143057b, this.f143058c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HKDF PRF Parameters (hashType: ");
        sb4.append(this.f143057b);
        sb4.append(", salt: ");
        sb4.append(this.f143058c);
        sb4.append(", and ");
        return AbstractC18489d0.m53371l(sb4, this.f143056a, "-byte key)");
    }
}
