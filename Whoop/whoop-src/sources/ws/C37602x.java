package ws;

import ih0.AbstractC18489d0;
import java.math.BigInteger;
import java.util.Objects;
import p347ns.AbstractC27099t;

/* JADX INFO: renamed from: ws.x */
/* JADX INFO: loaded from: classes.dex */
public final class C37602x extends AbstractC27099t {

    /* JADX INFO: renamed from: g */
    public static final BigInteger f160819g = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f160820a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f160821b;

    /* JADX INFO: renamed from: c */
    public final C37601w f160822c;

    /* JADX INFO: renamed from: d */
    public final C37600v f160823d;

    /* JADX INFO: renamed from: e */
    public final C37600v f160824e;

    /* JADX INFO: renamed from: f */
    public final int f160825f;

    public C37602x(int i13, BigInteger bigInteger, C37601w c37601w, C37600v c37600v, C37600v c37600v2, int i14) {
        this.f160820a = i13;
        this.f160821b = bigInteger;
        this.f160822c = c37601w;
        this.f160823d = c37600v;
        this.f160824e = c37600v2;
        this.f160825f = i14;
    }

    /* JADX INFO: renamed from: b */
    public static C37599u m120657b() {
        C37599u c37599u = new C37599u();
        c37599u.f160804a = null;
        c37599u.f160805b = f160819g;
        c37599u.f160806c = null;
        c37599u.f160807d = null;
        c37599u.f160808e = null;
        c37599u.f160809f = C37601w.f160817e;
        return c37599u;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f160822c != C37601w.f160817e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C37602x)) {
            return false;
        }
        C37602x c37602x = (C37602x) obj;
        return c37602x.f160820a == this.f160820a && Objects.equals(c37602x.f160821b, this.f160821b) && Objects.equals(c37602x.f160822c, this.f160822c) && Objects.equals(c37602x.f160823d, this.f160823d) && Objects.equals(c37602x.f160824e, this.f160824e) && c37602x.f160825f == this.f160825f;
    }

    public final int hashCode() {
        return Objects.hash(C37602x.class, Integer.valueOf(this.f160820a), this.f160821b, this.f160822c, this.f160823d, this.f160824e, Integer.valueOf(this.f160825f));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RSA SSA PSS Parameters (variant: ");
        sb4.append(this.f160822c);
        sb4.append(", signature hashType: ");
        sb4.append(this.f160823d);
        sb4.append(", mgf1 hashType: ");
        sb4.append(this.f160824e);
        sb4.append(", saltLengthBytes: ");
        sb4.append(this.f160825f);
        sb4.append(", publicExponent: ");
        sb4.append(this.f160821b);
        sb4.append(", and ");
        return AbstractC18489d0.m53371l(sb4, this.f160820a, "-bit modulus)");
    }
}
