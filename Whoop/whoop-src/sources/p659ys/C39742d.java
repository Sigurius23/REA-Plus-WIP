package p659ys;

import com.google.crypto.tink.internal.C5099k0;
import d13.AbstractC11478a;
import java.util.Objects;
import p347ns.AbstractC27099t;

/* JADX INFO: renamed from: ys.d */
/* JADX INFO: loaded from: classes.dex */
public final class C39742d extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final Integer f171105a;

    /* JADX INFO: renamed from: b */
    public final Integer f171106b;

    /* JADX INFO: renamed from: c */
    public final C39741c f171107c;

    /* JADX INFO: renamed from: d */
    public final C39741c f171108d;

    /* JADX INFO: renamed from: e */
    public final Integer f171109e;

    /* JADX INFO: renamed from: f */
    public final Integer f171110f;

    public C39742d(Integer num, Integer num2, C39741c c39741c, C39741c c39741c2, Integer num3, Integer num4) {
        this.f171105a = num;
        this.f171106b = num2;
        this.f171107c = c39741c;
        this.f171108d = c39741c2;
        this.f171109e = num3;
        this.f171110f = num4;
    }

    /* JADX INFO: renamed from: b */
    public static C5099k0 m127159b() {
        C5099k0 c5099k0 = new C5099k0();
        c5099k0.f21438w = null;
        c5099k0.f21439x = null;
        c5099k0.f21440y = null;
        c5099k0.f21441z = null;
        c5099k0.f21436E = null;
        c5099k0.f21437F = null;
        return c5099k0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39742d)) {
            return false;
        }
        C39742d c39742d = (C39742d) obj;
        return c39742d.f171105a.intValue() == this.f171105a.intValue() && c39742d.f171106b.intValue() == this.f171106b.intValue() && c39742d.f171107c == this.f171107c && c39742d.f171108d == this.f171108d && c39742d.f171109e.intValue() == this.f171109e.intValue() && c39742d.f171110f.intValue() == this.f171110f.intValue();
    }

    public final int hashCode() {
        return Objects.hash(C39742d.class, this.f171105a, this.f171106b, this.f171107c, this.f171108d, this.f171109e, this.f171110f);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AesCtrHmacStreaming Parameters (IKM size: ");
        sb4.append(this.f171105a);
        sb4.append(", ");
        sb4.append(this.f171106b);
        sb4.append("-byte AES key, ");
        C39741c c39741c = this.f171107c;
        sb4.append(c39741c);
        sb4.append(" for HKDF, ");
        sb4.append(c39741c);
        sb4.append(" for HMAC, ");
        sb4.append(this.f171109e);
        sb4.append("-byte tags, ");
        return AbstractC11478a.m30859k(sb4, this.f171110f, "-byte ciphertexts)");
    }
}
