package p659ys;

import d13.AbstractC11478a;
import java.util.Objects;
import p347ns.AbstractC27099t;
import p692zt.C41113q;

/* JADX INFO: renamed from: ys.g */
/* JADX INFO: loaded from: classes.dex */
public final class C39745g extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final Integer f171117a;

    /* JADX INFO: renamed from: b */
    public final Integer f171118b;

    /* JADX INFO: renamed from: c */
    public final C39741c f171119c;

    /* JADX INFO: renamed from: d */
    public final Integer f171120d;

    public C39745g(Integer num, Integer num2, C39741c c39741c, Integer num3) {
        this.f171117a = num;
        this.f171118b = num2;
        this.f171119c = c39741c;
        this.f171120d = num3;
    }

    /* JADX INFO: renamed from: b */
    public static C41113q m127160b() {
        C41113q c41113q = new C41113q(22, false);
        c41113q.f177224x = null;
        c41113q.f177225y = null;
        c41113q.f177226z = null;
        c41113q.f177222E = null;
        return c41113q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39745g)) {
            return false;
        }
        C39745g c39745g = (C39745g) obj;
        return c39745g.f171117a.intValue() == this.f171117a.intValue() && c39745g.f171118b.intValue() == this.f171118b.intValue() && c39745g.f171119c == this.f171119c && c39745g.f171120d.intValue() == this.f171120d.intValue();
    }

    public final int hashCode() {
        return Objects.hash(C39745g.class, this.f171117a, this.f171118b, this.f171119c, this.f171120d);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AesGcmHkdfStreaming Parameters (IKM size: ");
        sb4.append(this.f171117a);
        sb4.append(", ");
        sb4.append(this.f171118b);
        sb4.append("-byte AES GCM key, ");
        sb4.append(this.f171119c);
        sb4.append(" for HKDF ");
        return AbstractC11478a.m30859k(sb4, this.f171120d, "-byte ciphertexts)");
    }
}
