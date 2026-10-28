package p465rm;

import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24567y;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import qa.C30097b;

/* JADX INFO: renamed from: rm.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31545k0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: F */
    public static final C30097b f130203F;

    /* JADX INFO: renamed from: E */
    public final C31533g0 f130204E;

    /* JADX INFO: renamed from: w */
    public final String f130205w;

    /* JADX INFO: renamed from: x */
    public final C31539i0 f130206x;

    /* JADX INFO: renamed from: y */
    public final C31536h0 f130207y;

    /* JADX INFO: renamed from: z */
    public final C31551m0 f130208z;

    static {
        C31527e0 c31527e0 = new C31527e0();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        new C31533g0(c31527e0);
        new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        C31551m0 c31551m0 = C31551m0.f130246h0;
        f130203F = new C30097b(17);
    }

    public C31545k0(String str, C31533g0 c31533g0, C31539i0 c31539i0, C31536h0 c31536h0, C31551m0 c31551m0) {
        this.f130205w = str;
        this.f130206x = c31539i0;
        this.f130207y = c31536h0;
        this.f130208z = c31551m0;
        this.f130204E = c31533g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31545k0)) {
            return false;
        }
        C31545k0 c31545k0 = (C31545k0) obj;
        return AbstractC24567y.m71670a(this.f130205w, c31545k0.f130205w) && this.f130204E.equals(c31545k0.f130204E) && AbstractC24567y.m71670a(this.f130206x, c31545k0.f130206x) && this.f130207y.equals(c31545k0.f130207y) && AbstractC24567y.m71670a(this.f130208z, c31545k0.f130208z);
    }

    public final int hashCode() {
        int iHashCode = this.f130205w.hashCode() * 31;
        C31539i0 c31539i0 = this.f130206x;
        return this.f130208z.hashCode() + ((this.f130204E.hashCode() + ((this.f130207y.hashCode() + ((iHashCode + (c31539i0 != null ? c31539i0.hashCode() : 0)) * 31)) * 31)) * 31);
    }
}
