package gs;

import ih0.AbstractC18489d0;
import java.util.Objects;
import p692zt.C41113q;

/* JADX INFO: renamed from: gs.q */
/* JADX INFO: loaded from: classes.dex */
public final class C16148q extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final int f61352a;

    /* JADX INFO: renamed from: b */
    public final int f61353b;

    /* JADX INFO: renamed from: c */
    public final int f61354c;

    /* JADX INFO: renamed from: d */
    public final C16139j f61355d;

    public C16148q(int i13, int i14, int i15, C16139j c16139j) {
        this.f61352a = i13;
        this.f61353b = i14;
        this.f61354c = i15;
        this.f61355d = c16139j;
    }

    /* JADX INFO: renamed from: b */
    public static C41113q m45693b() {
        C41113q c41113q = new C41113q(9, false);
        c41113q.f177224x = null;
        c41113q.f177225y = null;
        c41113q.f177226z = null;
        c41113q.f177222E = C16139j.f61309p;
        return c41113q;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61355d != C16139j.f61309p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16148q)) {
            return false;
        }
        C16148q c16148q = (C16148q) obj;
        return c16148q.f61352a == this.f61352a && c16148q.f61353b == this.f61353b && c16148q.f61354c == this.f61354c && c16148q.f61355d == this.f61355d;
    }

    public final int hashCode() {
        return Objects.hash(C16148q.class, Integer.valueOf(this.f61352a), Integer.valueOf(this.f61353b), Integer.valueOf(this.f61354c), this.f61355d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AesGcm Parameters (variant: ");
        sb4.append(this.f61355d);
        sb4.append(", ");
        sb4.append(this.f61353b);
        sb4.append("-byte IV, ");
        sb4.append(this.f61354c);
        sb4.append("-byte tag, and ");
        return AbstractC18489d0.m53371l(sb4, this.f61352a, "-byte key)");
    }
}
