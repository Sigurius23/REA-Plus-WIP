package ws;

import java.util.Objects;
import p347ns.AbstractC27099t;
import p692zt.C41113q;

/* JADX INFO: renamed from: ws.c */
/* JADX INFO: loaded from: classes.dex */
public final class C37581c extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final C37579b f160714a;

    /* JADX INFO: renamed from: b */
    public final C37577a f160715b;

    /* JADX INFO: renamed from: c */
    public final C37579b f160716c;

    /* JADX INFO: renamed from: d */
    public final C37579b f160717d;

    public C37581c(C37579b c37579b, C37577a c37577a, C37579b c37579b2, C37579b c37579b3) {
        this.f160714a = c37579b;
        this.f160715b = c37577a;
        this.f160716c = c37579b2;
        this.f160717d = c37579b3;
    }

    /* JADX INFO: renamed from: b */
    public static C41113q m120650b() {
        C41113q c41113q = new C41113q(20, false);
        c41113q.f177224x = null;
        c41113q.f177225y = null;
        c41113q.f177226z = null;
        c41113q.f177222E = C37579b.f160711k;
        return c41113q;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f160717d != C37579b.f160711k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C37581c)) {
            return false;
        }
        C37581c c37581c = (C37581c) obj;
        return c37581c.f160714a == this.f160714a && c37581c.f160715b == this.f160715b && c37581c.f160716c == this.f160716c && c37581c.f160717d == this.f160717d;
    }

    public final int hashCode() {
        return Objects.hash(C37581c.class, this.f160714a, this.f160715b, this.f160716c, this.f160717d);
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.f160717d + ", hashType: " + this.f160716c + ", encoding: " + this.f160714a + ", curve: " + this.f160715b + ")";
    }
}
