package p347ns;

import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.TinkBugException;
import io.sentry.okhttp.C20450b;
import java.util.Objects;
import java.util.Set;
import p075ct.C11105a;
import p154fs.AbstractC14733k;

/* JADX INFO: renamed from: ns.f */
/* JADX INFO: loaded from: classes.dex */
public final class C27085f extends AbstractC27099t {

    /* JADX INFO: renamed from: g */
    public static final Set f108262g;

    /* JADX INFO: renamed from: a */
    public final C27081b f108263a;

    /* JADX INFO: renamed from: b */
    public final C27082c f108264b;

    /* JADX INFO: renamed from: c */
    public final C27083d f108265c;

    /* JADX INFO: renamed from: d */
    public final C27084e f108266d;

    /* JADX INFO: renamed from: e */
    public final AbstractC14733k f108267e;

    /* JADX INFO: renamed from: f */
    public final C11105a f108268f;

    static {
        C20450b c20450b = new C20450b(20);
        int i13 = TinkBugException.f21380w;
        try {
            f108262g = (Set) c20450b.m56648k();
        } catch (Exception e5) {
            throw new TinkBugException(e5);
        }
    }

    public C27085f(C27081b c27081b, C27082c c27082c, C27083d c27083d, AbstractC14733k abstractC14733k, C27084e c27084e, C11105a c11105a) {
        this.f108263a = c27081b;
        this.f108264b = c27082c;
        this.f108265c = c27083d;
        this.f108267e = abstractC14733k;
        this.f108266d = c27084e;
        this.f108268f = c11105a;
    }

    /* JADX INFO: renamed from: b */
    public static C5099k0 m81452b() {
        C5099k0 c5099k0 = new C5099k0();
        c5099k0.f21439x = null;
        c5099k0.f21441z = null;
        c5099k0.f21436E = null;
        c5099k0.f21437F = null;
        c5099k0.f21438w = C27084e.f108260d;
        c5099k0.f21440y = null;
        return c5099k0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27085f)) {
            return false;
        }
        C27085f c27085f = (C27085f) obj;
        return Objects.equals(c27085f.f108263a, this.f108263a) && Objects.equals(c27085f.f108264b, this.f108264b) && Objects.equals(c27085f.f108265c, this.f108265c) && Objects.equals(c27085f.f108267e, this.f108267e) && Objects.equals(c27085f.f108266d, this.f108266d) && Objects.equals(c27085f.f108268f, this.f108268f);
    }

    public final int hashCode() {
        return Objects.hash(C27085f.class, this.f108263a, this.f108264b, this.f108265c, this.f108267e, this.f108266d, this.f108268f);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.f108263a, this.f108264b, this.f108265c, this.f108267e, this.f108266d, this.f108268f);
    }
}
