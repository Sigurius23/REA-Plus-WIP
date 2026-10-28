package ws;

import ih0.AbstractC18489d0;
import java.math.BigInteger;
import java.util.Objects;
import p347ns.AbstractC27099t;

/* JADX INFO: renamed from: ws.q */
/* JADX INFO: loaded from: classes.dex */
public final class C37595q extends AbstractC27099t {

    /* JADX INFO: renamed from: e */
    public static final BigInteger f160780e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a */
    public final int f160781a;

    /* JADX INFO: renamed from: b */
    public final BigInteger f160782b;

    /* JADX INFO: renamed from: c */
    public final C37594p f160783c;

    /* JADX INFO: renamed from: d */
    public final C37593o f160784d;

    public C37595q(int i13, BigInteger bigInteger, C37594p c37594p, C37593o c37593o) {
        this.f160781a = i13;
        this.f160782b = bigInteger;
        this.f160783c = c37594p;
        this.f160784d = c37593o;
    }

    /* JADX INFO: renamed from: b */
    public static C37592n m120654b() {
        C37592n c37592n = new C37592n();
        c37592n.f160767a = null;
        c37592n.f160768b = f160780e;
        c37592n.f160769c = null;
        c37592n.f160770d = C37594p.f160778e;
        return c37592n;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f160783c != C37594p.f160778e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C37595q)) {
            return false;
        }
        C37595q c37595q = (C37595q) obj;
        return c37595q.f160781a == this.f160781a && Objects.equals(c37595q.f160782b, this.f160782b) && c37595q.f160783c == this.f160783c && c37595q.f160784d == this.f160784d;
    }

    public final int hashCode() {
        return Objects.hash(C37595q.class, Integer.valueOf(this.f160781a), this.f160782b, this.f160783c, this.f160784d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RSA SSA PKCS1 Parameters (variant: ");
        sb4.append(this.f160783c);
        sb4.append(", hashType: ");
        sb4.append(this.f160784d);
        sb4.append(", publicExponent: ");
        sb4.append(this.f160782b);
        sb4.append(", and ");
        return AbstractC18489d0.m53371l(sb4, this.f160781a, "-bit modulus)");
    }
}
