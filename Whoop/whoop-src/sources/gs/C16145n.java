package gs;

import ih0.AbstractC18489d0;
import java.util.Objects;
import p692zt.C41113q;

/* JADX INFO: renamed from: gs.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16145n extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final int f61339a;

    /* JADX INFO: renamed from: b */
    public final int f61340b;

    /* JADX INFO: renamed from: c */
    public final int f61341c;

    /* JADX INFO: renamed from: d */
    public final C16139j f61342d;

    public C16145n(int i13, int i14, int i15, C16139j c16139j) {
        this.f61339a = i13;
        this.f61340b = i14;
        this.f61341c = i15;
        this.f61342d = c16139j;
    }

    /* JADX INFO: renamed from: b */
    public static C41113q m45692b() {
        C41113q c41113q = new C41113q(8, false);
        c41113q.f177224x = null;
        c41113q.f177225y = null;
        c41113q.f177226z = null;
        c41113q.f177222E = C16139j.f61306m;
        return c41113q;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61342d != C16139j.f61306m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16145n)) {
            return false;
        }
        C16145n c16145n = (C16145n) obj;
        return c16145n.f61339a == this.f61339a && c16145n.f61340b == this.f61340b && c16145n.f61341c == this.f61341c && c16145n.f61342d == this.f61342d;
    }

    public final int hashCode() {
        return Objects.hash(C16145n.class, Integer.valueOf(this.f61339a), Integer.valueOf(this.f61340b), Integer.valueOf(this.f61341c), this.f61342d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AesEax Parameters (variant: ");
        sb4.append(this.f61342d);
        sb4.append(", ");
        sb4.append(this.f61340b);
        sb4.append("-byte IV, ");
        sb4.append(this.f61341c);
        sb4.append("-byte tag, and ");
        return AbstractC18489d0.m53371l(sb4, this.f61339a, "-byte key)");
    }
}
