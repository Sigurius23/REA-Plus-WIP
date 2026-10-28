package p436qs;

import ih0.AbstractC18489d0;
import java.util.Objects;
import p005a3.C0237p;
import p347ns.AbstractC27099t;

/* JADX INFO: renamed from: qs.d */
/* JADX INFO: loaded from: classes.dex */
public final class C30560d extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final int f125761a;

    /* JADX INFO: renamed from: b */
    public final int f125762b;

    /* JADX INFO: renamed from: c */
    public final C30559c f125763c;

    public C30560d(int i13, int i14, C30559c c30559c) {
        this.f125761a = i13;
        this.f125762b = i14;
        this.f125763c = c30559c;
    }

    /* JADX INFO: renamed from: b */
    public static C0237p m93711b() {
        C0237p c0237p = new C0237p(27, false);
        c0237p.f812x = null;
        c0237p.f813y = null;
        c0237p.f814z = C30559c.f125759e;
        return c0237p;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f125763c != C30559c.f125759e;
    }

    /* JADX INFO: renamed from: c */
    public final int m93712c() {
        C30559c c30559c = C30559c.f125759e;
        int i13 = this.f125762b;
        C30559c c30559c2 = this.f125763c;
        if (c30559c2 == c30559c) {
            return i13;
        }
        if (c30559c2 != C30559c.f125756b && c30559c2 != C30559c.f125757c && c30559c2 != C30559c.f125758d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i13 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30560d)) {
            return false;
        }
        C30560d c30560d = (C30560d) obj;
        return c30560d.f125761a == this.f125761a && c30560d.m93712c() == m93712c() && c30560d.f125763c == this.f125763c;
    }

    public final int hashCode() {
        return Objects.hash(C30560d.class, Integer.valueOf(this.f125761a), Integer.valueOf(this.f125762b), this.f125763c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb4.append(this.f125763c);
        sb4.append(", ");
        sb4.append(this.f125762b);
        sb4.append("-byte tags, and ");
        return AbstractC18489d0.m53371l(sb4, this.f125761a, "-byte key)");
    }
}
