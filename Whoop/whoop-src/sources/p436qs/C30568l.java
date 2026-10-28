package p436qs;

import ih0.AbstractC18489d0;
import java.util.Objects;
import p347ns.AbstractC27099t;
import p692zt.C41113q;

/* JADX INFO: renamed from: qs.l */
/* JADX INFO: loaded from: classes.dex */
public final class C30568l extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final int f125789a;

    /* JADX INFO: renamed from: b */
    public final int f125790b;

    /* JADX INFO: renamed from: c */
    public final C30567k f125791c;

    /* JADX INFO: renamed from: d */
    public final C30566j f125792d;

    public C30568l(int i13, int i14, C30567k c30567k, C30566j c30566j) {
        this.f125789a = i13;
        this.f125790b = i14;
        this.f125791c = c30567k;
        this.f125792d = c30566j;
    }

    /* JADX INFO: renamed from: b */
    public static C41113q m93713b() {
        C41113q c41113q = new C41113q(18, false);
        c41113q.f177224x = null;
        c41113q.f177225y = null;
        c41113q.f177226z = null;
        c41113q.f177222E = C30567k.f125787e;
        return c41113q;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f125791c != C30567k.f125787e;
    }

    /* JADX INFO: renamed from: c */
    public final int m93714c() {
        C30567k c30567k = C30567k.f125787e;
        int i13 = this.f125790b;
        C30567k c30567k2 = this.f125791c;
        if (c30567k2 == c30567k) {
            return i13;
        }
        if (c30567k2 != C30567k.f125784b && c30567k2 != C30567k.f125785c && c30567k2 != C30567k.f125786d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i13 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30568l)) {
            return false;
        }
        C30568l c30568l = (C30568l) obj;
        return c30568l.f125789a == this.f125789a && c30568l.m93714c() == m93714c() && c30568l.f125791c == this.f125791c && c30568l.f125792d == this.f125792d;
    }

    public final int hashCode() {
        return Objects.hash(C30568l.class, Integer.valueOf(this.f125789a), Integer.valueOf(this.f125790b), this.f125791c, this.f125792d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HMAC Parameters (variant: ");
        sb4.append(this.f125791c);
        sb4.append(", hashType: ");
        sb4.append(this.f125792d);
        sb4.append(", ");
        sb4.append(this.f125790b);
        sb4.append("-byte tags, and ");
        return AbstractC18489d0.m53371l(sb4, this.f125789a, "-byte key)");
    }
}
